package oop;

import java.time.LocalDate;

public class Porduct1 {
    public static void main(String[] args) {

        // 인스턴스 생성
        // 생성자 호출
        Porduct Porduct1 = new Porduct();
        // 초기화
        Porduct1.pCode = "op8579";
        Porduct1.pName = "파스타 면";
        Porduct1.price = 12000;
        Porduct1.regiDate = LocalDate.now();
        System.out.println(Porduct1);
    }

}
