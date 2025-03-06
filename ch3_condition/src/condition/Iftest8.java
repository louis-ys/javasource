package condition;

import java.util.Scanner;

public class Iftest8 {
    public static void main(String[] args) {
    //   임금 구하기

    //   시간당 임금
        int rate = 9800;
        int pay, hours;

        // 사용자로부터 근무시간을 입력받아  hours 변수에 담기

        //  근무시간이 8시간 까지는 시간당 임금을 지불 
        //  8시간 초과 근무시에는 시간당 임금의 1.5배 지불
//  임금 계산 후 pay 변수에 담기 

//  최종 출력 
//  받는 임금은 120000
        Scanner scanner = new Scanner(System.in);
         System.out.println("근무시간 입력");
         String input = scanner.nextLine();
         hours = Integer.parseInt(input);


         if (hours > 8 ) {

             pay =rate * 8 + (int)( rate * 1.5* (hours - 8));
            
         } else { 
          pay = rate *hours;

             
            
         }
         System.out.println("받는 임금은 "+pay ); 
         
    }
}
