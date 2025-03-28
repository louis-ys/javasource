package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {

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

    // select, insert, update,delete 처리 메소드
    public int update(EmpDTO eDto) {
        con = getConnection();

        String sql = "UPDATE emp_temp SET sal = ? WHERE empno=?";
        int result = 0;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, eDto.getSal());
            pstmt.setInt(2, eDto.getEmpNo());
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;
    }

    public int delete(int empNo) {
        con = getConnection();

        String sql = "delete from emp_temp where empno=?";

        int result = 0;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, empNo);
            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;

    }

    public int insert(EmpDTO eDto) {
        con = getConnection();
        int result = 0;

        try {
            String sql = "insert into emp_temp(empno,ENAME,job,mgr,HIREDATE,sal,COMM,deptno) ";
            sql += "values(?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, eDto.getEmpNo());
            pstmt.setString(2, eDto.getEName());
            pstmt.setString(3, eDto.getJob());
            pstmt.setInt(4, eDto.getMgr());
            pstmt.setDate(5, eDto.getHireDate());
            pstmt.setInt(6, eDto.getSal());
            pstmt.setInt(7, eDto.getComm());
            pstmt.setInt(8, eDto.getDeptNo());
            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return result;

    }

    public List<EmpDTO> selectAll() {

        con = getConnection();
        String sql = "SELECT * FROM emp_temp";
        List<EmpDTO> list = new ArrayList<>();

        try {
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                EmpDTO eDto = new EmpDTO();
                eDto.setEmpNo(rs.getInt("empno"));
                eDto.setEName(rs.getString("EName"));
                eDto.setJob(rs.getString("job"));
                eDto.setMgr(rs.getInt("mgr"));
                eDto.setHireDate(rs.getDate("giredate"));
                eDto.setComm(rs.getInt("comm"));
                eDto.setDeptNo(rs.getInt("DeptNo"));
                eDto.setSal(rs.getInt("sal"));
                list.add(eDto);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }

        return list;

    }

    public EmpDTO select(int empNo) {

        con = getConnection();
        String sql = "SELECT * FROM emp_temp WHERE empno =?";
        EmpDTO eDto = null;

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, empNo);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                eDto = new EmpDTO();
                eDto.setEmpNo(rs.getInt("empno"));
                eDto.setEName(rs.getString("EName"));
                eDto.setJob(rs.getString("job"));
                eDto.setMgr(rs.getInt("mgr"));
                eDto.setHireDate(rs.getDate("giredate"));
                eDto.setComm(rs.getInt("comm"));
                eDto.setDeptNo(rs.getInt("DeptNo"));
                eDto.setSal(rs.getInt("sal"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }

        return eDto;

    }
}
