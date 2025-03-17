package oop;
// impor 문 

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static java.lang.Math.*;
import extend.Parent;

// imprt 사용하지 않는 패키지 (자동 import 처리 해줌)
//  java.lang.* (lang 패키지에 속한 모든 클래스)

// 다른 패키지의 클래스 사용할 때 

public class ImportEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parent Parent = new Parent();

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        System.out.println("오늘 날짜는 : " + sdf.format(date));

        System.out.println(Math.min(15, 25));

        String str;
    }

}
