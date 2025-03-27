package select.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import select.dto.DeptDTO;

public class InsertEx2 {

    private static Scanner scanner = new Scanner(System.in);

    public static DeptDTO date(Scanner scanner) {
        // 테이블에 저장 데이터 입력받기
        System.out.println("------- dept 테이블 데이터 입력 ---------");
        System.out.println("deptno >> ");
        int deptno = Integer.parseInt(scanner.nextLine());
        System.out.println("dname >> ");
        String dname = scanner.nextLine();
        System.out.println("loc >> ");
        String loc = scanner.nextLine();

        DeptDTO dto = new DeptDTO(deptno, dname, loc);

        return dto;

    }

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";
            // 삭제대상 부서가 고정이 아닐 때
            con = DriverManager.getConnection(url, user, password);

            date(scanner);

            DeptDTO dto = date(scanner);

            String sql = "insert into dept_temp(deptno,dname,loc) values(?,?,?)";

            pstmt = con.prepareStatement(sql);
            // ? 세팅
            pstmt.setInt(1, dto.getDeptno());
            pstmt.setString(2, dto.getDame());
            pstmt.setString(3, dto.getLoc());

            int result = pstmt.executeUpdate();

            System.out.println(result > 0 ? "입력성공" : " 입력실패");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
