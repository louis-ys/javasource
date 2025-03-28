package meber;

import java.util.List;
import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MemberDAO mDao = new MemberDAO();
        MemberDTO mDto = null;
        ConsoleUtil util = new ConsoleUtil();
        boolean run = true;
        int result = 0;
        while (run) {

            System.out.println("========================================");
            System.out.println("1. member 추가");
            System.out.println("2. member 수정");
            System.out.println("3. member 삭제");
            System.out.println("4. member 조회");
            System.out.println("5. member 전체조회");
            System.out.println("6. 단어로 사람찾기");
            System.out.println("7. 종료");
            System.out.println("========================================");
            System.out.println("메뉴 선택 >>");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:

                    MemberDTO dto = util.memberInsertInfo(sc);
                    result = mDao.insert(dto);
                    util.printSuccessMessage(result);

                    break;

                case 2:
                    mDto = util.memberUpdateMenu(sc);
                    if (mDto != null) {
                        result = mDao.update(mDto);
                        util.printUpdateSuccessMessage(result, mDto.getId());
                    }
                    break;

                case 3:
                    String id = util.memeberDeleteInfo(sc);
                    result = mDao.delete(id);
                    util.printSuccessMessage(result);

                    break;

                case 4:
                    id = util.memberGetInfo(sc);
                    MemberDTO row = mDao.getRow(id);
                    if (row != null) {
                        util.memberPrint(row.getId());
                    } else {
                        System.out.println("실패");
                    }

                    break;

                case 5:
                    List<MemberDTO> list = mDao.getList();
                    util.memberAllPrint(list);

                    break;

                case 6:
                    List<MemberDTO> list2 = mDao.getList();
                    util.memberAllPrint(list2);

                    break;

                case 7:
                    run = false;
                    break;

                default:
                    break;
            }
        }

    }

}
