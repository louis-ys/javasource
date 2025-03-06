package condition;

//  특정 조건을 만족하면 문장 실행
//  if(조건문){}
//  특정 조건을 만족하면 구문 1 실행 만족하지 않을 때는 구문 2 실행
// if(조건문){구문1}else{구문2}

public class IfTest2 {
    public static void main(String[] args) {
         // score가 90보다 크면 점수가 90점 이상입니다, 등급은 A 입니다.
         // score가 90보다 작으면 점수가 90점 미만입니다, 등급은 B 입니다.

         int score = 93;

if (score > 90) {
    System.out.println("점수가 90점 이상입니다.");
    System.out.println("등급은 A 입니다.");
} else { 
    System.out.println("점수가 90점 미만입니다.");
    System.out.println("등급은 B 입니다.");
    
}
                 
         }

    
    }
    

