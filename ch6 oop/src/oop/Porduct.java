package oop;

import java.time.LocalDate;

public class Porduct {
    // 속성
    // 제품번호(op8579), 제품명(파스타 면), 가격(12000), 제조년도(2025-03-04)
    String pCode;
    String pName;
    int price;
    LocalDate regiDate;

    // 기능 -가격 변경
    void changePrice() {

    }

    @Override
    public String toString() {
        return "Porduct [pCode=" + pCode + ", pName=" + pName + ", price=" + price + ", regiDate=" + regiDate + "]";
    }

}
