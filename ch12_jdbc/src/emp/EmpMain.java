package emp;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class EmpMain {

    public static void main(String[] args) {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        int empNo = 0, result = 0;
        EmpDAO eDao = new EmpDAO();
        EmpDTO eDto = null;
        while (run) {
            System.out.println("=======================================");
            System.out.println("1. 입력");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 조회");
            System.out.println("5. 종료");
            System.out.println("=======================================");

            System.out.print("메뉴 >> ");
            int menu = Integer.parseInt(scanner.nextLine());

            switch (menu) {
                case 1:
                    eDto = insertinfo(scanner);
                    result = eDao.insert(eDto);
                    System.out.println(result > 0 ? " 성공" : "실패");
                    break;
                case 2:
                    eDto = updateinfo(scanner);
                    result = eDao.update(eDto);
                    System.out.println(result > 0 ? "수정성공" : "수정실패");
                    break;
                case 3:
                    empNo = deleteinfo(scanner);
                    result = eDao.delete(empNo);
                    System.out.println(result > 0 ? "삭제성공" : "삭제실패");
                    break;
                case 4:
                    break;
                case 5:
                    run = false;
                    break;

                default:
                    break;
            }
        }
    }

    public static int deleteinfo(Scanner scanner) {
        // 삭제할 empno 입력받은 후 리턴
        System.out.println("삭제 대상 empNo >> ");
        int empNo = Integer.parseInt(scanner.nextLine());
        return empNo;

    }

    public static EmpDTO updateinfo(Scanner scanner) {
        // 수정할 empno 입력받은 후 리턴
        System.out.println("수정대상  >> ");
        int empNo = Integer.parseInt(scanner.nextLine());
        System.out.println("변경 급여  >> ");
        int sal = Integer.parseInt(scanner.nextLine());

        EmpDTO eDto = EmpDTO.builder().empNo(empNo).sal(sal).build();
        return eDto;

    }

    public static EmpDTO insertinfo(Scanner scanner) {
        // 새로운 사원
        System.out.println("사번  >> ");
        int empNo = Integer.parseInt(scanner.nextLine());

        System.out.println("이름  >> ");
        String eName = scanner.nextLine();

        System.out.println(" 직무 >> ");
        String job = scanner.nextLine();

        System.out.println("입사일  >> ");
        String hireDAte = scanner.nextLine();

        System.out.println("급여  >> ");
        int sal = Integer.parseInt(scanner.nextLine());
        System.out.println("수당  >> ");
        int comm = Integer.parseInt(scanner.nextLine());
        System.out.println("부서번호  >> ");
        int deptNo = Integer.parseInt(scanner.nextLine());

        Date date = null;
        try {
            date = (Date) new SimpleDateFormat("yyyy-MM-dd").parse(hireDAte);
        } catch (Exception e) {
            e.printStackTrace();
        }

        EmpDTO eDto = EmpDTO.builder()
                .empNo(empNo).sal(sal)
                .job(job)
                .mgr(deptNo)
                .hireDate(date)
                .sal(sal)
                .comm(comm)
                .deptNo(deptNo)
                .build();
        return eDto;

    }

}
