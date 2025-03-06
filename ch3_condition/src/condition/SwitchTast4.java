package condition;

import java.util.Scanner;

//  switch : 조건문 if ~ else if ~ else 대체

public class SwitchTast4 {

    public static void main(String[] args) {
    //    가위(1), 바위(2), 보(3)
       
        // 컴퓨터의 내는 가위,바위,보 결정
        int computer = (int)(Math.random() * 3) + 1;


        // 사용자가 내는 가위,바위,보 결정
         Scanner scanner = new Scanner(System.in);
         System.out.println("가위(1), 바위(2), 보(3) 입력");
         String input = scanner.nextLine();
         int user = Integer.parseInt(input);

         switch (input) {
            case "":

                
                break;
         
            default:
                break;
         }


        }
    }


