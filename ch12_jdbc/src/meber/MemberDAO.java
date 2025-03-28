package meber;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class MemberDAO {

    public void memberPrint(MemberDTO dto) {
        System.out.println("===== 조회한 회원 정보 ======");
        System.out.println("번호 :" + dto.getNo());
        System.out.println("아이디 :" + dto.getId());
        System.out.println("이름 :" + dto.getName());
        System.out.println("주소 :" + dto.getAddr());
        System.out.println("이메일 :" + dto.getEmail());
        System.out.println("나이 :" + dto.getAge());
    }

    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // static : 인스턴스변수, 인스턴스메서드 앞에 붙으면 공유 (생성되는 모든 인스턴스가 같은 걸 사용)
    // 로드 시점이 가장 처음에 로드됨
    static {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public MemberDTO getRow(String id) {
        MemberDTO memberDTO = null;

        try {
            con = getConnection();
            String sql = "select * from member where id =? ";

            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                memberDTO = new MemberDTO();
                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return memberDTO;
    }

    public Connection getConnection() {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "tiger";
        // 삭제대상 부서가 고정이 아닐 때
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public void close(Connection con, PreparedStatement pstmt) {
        try {
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // DML + Select
    // insert,delete,update : int 리턴
    // select : ~~DTO(where pk 지정) or List <~~DTO>

    // insert,update : 전달인자 ~~ DTO 설정
    public int insert(MemberDTO memberDTO) {
        int result = 0;
        try {
            con = getConnection();
            String sql = "INSERT INTO member(no,id,name,addr,email,age)";
            sql += "values(member_seq.nextval,?,?,?,?,?)";

            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, memberDTO.getId());
            pstmt.setString(2, memberDTO.getName());
            pstmt.setString(3, memberDTO.getAddr());
            pstmt.setString(4, memberDTO.getEmail());
            pstmt.setInt(5, memberDTO.getAge());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public int update(MemberDTO memberDTO) {
        // memberDTO
        // 1. id, addr
        // 2. id, email

        int result = 0;
        try {
            con = getConnection();
            String sql = "update member ";
            if (memberDTO.getAddr() != null) {
                sql += "set addr = ? ";
                sql += "where id = ? ";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, memberDTO.getAddr());
                pstmt.setString(2, memberDTO.getId());
            } else {
                sql += "set email  = ? ";
                sql += "where id = ? ";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1, memberDTO.getEmail());
                pstmt.setString(2, memberDTO.getId());
            }

            // pstmt.setString(2, memberDTO.getName());
            // pstmt.setString(3, memberDTO.getAddr());
            // pstmt.setString(4, memberDTO.getEmail());

            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;

    }

    // delete : 전달인자 - pk 사용함
    public int delete(String id) {
        int result = 0;
        try {
            con = getConnection();

            String sql = "delete from member where id =?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, id);
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public List<MemberDTO> getList() {

        List<MemberDTO> list = new ArrayList<>();

        try {
            con = getConnection();
            String sql = "select * from member ";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                MemberDTO memberDTO = new MemberDTO();
                memberDTO = new MemberDTO();
                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));
                list.add(memberDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list;
    }

    public void memberAllPrint(List<MemberDTO> list) {
        for (MemberDTO dto : list) {
            memberPrint(dto);
        }
    }

    public List<MemberDTO> getList2(String name) {

        List<MemberDTO> list2 = new ArrayList<>();

        try {
            con = getConnection();
            String sql = "select * from member where name like ? ";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%" + name + "%");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                MemberDTO memberDTO = new MemberDTO();
                memberDTO = new MemberDTO();
                memberDTO.setNo(rs.getInt("no"));
                memberDTO.setId(rs.getString("id"));
                memberDTO.setName(rs.getString("name"));
                memberDTO.setAddr(rs.getString("addr"));
                memberDTO.setEmail(rs.getString("email"));
                memberDTO.setAge(rs.getInt("age"));
                list2.add(memberDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return list2;
    }
}
// DML + Select
