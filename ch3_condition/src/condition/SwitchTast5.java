package condition;

import java.util.Scanner;

//  switch : 조건문 if ~ else if ~ else 대체

public class SwitchTast5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수 입력");
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);

      
        switch ( num1 /10) {
        case 9: case 10:
            System.out.println("A");
            break;
            case 8:
            System.out.println("B");
            break;  
            case 7:
            System.out.println("C");
            break;  
           
        default:
        System.out.println("F");
            break;
    }


         }


        }
    


