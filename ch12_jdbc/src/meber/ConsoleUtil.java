package meber;

import java.util.List;
import java.util.Scanner;

public class ConsoleUtil {

    // 삭제 작업
    public String memeberDeleteInfo(Scanner sc) {

        System.out.println("======= 회원 삭제 =======");
        System.out.println("삭제 회원 아이디>");
        String id = sc.nextLine();
        return id;

        // 삭제할 회원 아이디
    }

    public MemberDTO memberInsertInfo(Scanner sc) {
        System.out.println();
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("=============== 회원정보 입력화면==================");
        System.out.println("아이디 >> ");
        memberDTO.setId(sc.nextLine());
        System.out.println("이름 >> ");
        memberDTO.setName(sc.nextLine());
        System.out.println("주소 >> ");
        memberDTO.setAddr(sc.nextLine());
        System.out.println("이메일 >> ");
        memberDTO.setEmail(sc.nextLine());
        System.out.println("나이 >> ");
        memberDTO.setAge(Integer.parseInt(sc.nextLine()));

        return memberDTO;
    }

    public void printSuccessMessage(int result) {

        System.out.println(result > 0 ? " 성공 " : " 실패 ");
        // result 값에 따라 입력 성공 / 실패 출력
    }

    public void printUpdateSuccessMessage(int result, String id) {

        System.out.println(result > 0 ? id + "정보를 수정하였습니다 " : id + "정보 수정 실패하셨습니다 ");
        // result 값에 따라 입력 성공 / 실패 출력
    }

    public MemberDTO memberUpdateMenu(Scanner sc) {
        System.out.println("============ 회원 정보 수정 ==================");
        System.out.println("1. 주소 수정");
        System.out.println("2. 이메일 수정");
        System.out.println("=============================================");
        System.out.println("번호  >>");
        int no = Integer.parseInt(sc.nextLine());

        if (no == 1) {
            return memberUpdateAddr(sc);

        } else if (no == 2) {
            return memberUpdateEmail(sc);
        }

        return null;
        // 리턴받은 DTO를 리턴
    }

    public String memberGetInfo(Scanner sc) {
        System.out.println("====회원 조회 ==");
        System.out.println("조회 회원 아이디 >>");
        return sc.nextLine();

    }

    public void memberPrint(String id) {
        System.out.println(id + "조회");
    }

    public MemberDTO memberUpdateAddr(Scanner sc) {
        MemberDTO memberDTO = new MemberDTO();
        System.out.println("=======수정정보입력==========");
        System.out.println("아이디 >>");
        memberDTO.setId(sc.nextLine());
        System.out.println("변경주소 >>");
        memberDTO.setAddr(sc.nextLine());
        return memberDTO;

        // 수정할 값 입력 (id,변경할 addr) => DTO 에 담은 후 리턴
    }

    public MemberDTO memberUpdateEmail(Scanner sc) {

        System.out.println("=======수정정보입력==========");
        System.out.println("아이디 >>");
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(sc.nextLine());
        System.out.println("변경이메일 >>");
        memberDTO.setEmail(sc.nextLine());
        return memberDTO;
        // 수정할 값 입력 (id ,변경할 email) => DTO에 담은후 호출

    }

    public void memberAllPrint(List<MemberDTO> list) {
        for (MemberDTO dto : list) {
            memberPrint(dto);
        }
    }

    public void memberPrint(MemberDTO dto) {
        System.out.println("===== 조회한 회원 정보 ======");
        System.out.println("번호 :" + dto.getNo());
        System.out.println("아이디 :" + dto.getId());
        System.out.println("이름 :" + dto.getName());
        System.out.println("주소 :" + dto.getAddr());
        System.out.println("이메일 :" + dto.getEmail());
        System.out.println("나이 :" + dto.getAge());
    }
}
