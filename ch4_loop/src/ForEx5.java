public class ForEx5 {

    // 반복문 - for, while, do~while
    // 반복적으로 실행해야 하는 코드를 간단하게 처리

    public static void main(String[] args) {
    //     3의 배수의 합 출력 
int a = 0;
    for (int i = 1; i < 101; i++) {
        if (i%3 == 0) {
            a +=i;
        }
        
    }
    System.out.println("1~100사이의 3 배수의 총합 : "+a);

    //     3의 배수 더하고 9의 배수는 뺀 합 출력 

     a = 0;
    for (int i = 1; i < 101; i++) {
        if (i%3 == 0 && i % 9 != 0) {
            a +=i;
        }
        
    }
    System.out.println("1~100사이의 3 배수이지만 9의 배수는 아닌 수의 총합 : "+a);


    //     3의 배수와 5의 배수 총합 출력
    a = 0;
    for (int i = 1; i < 101; i++) {
        if (i%3 == 0 || i % 5 == 0) {
            a +=i;
        }
        
    }
    System.out.println("1~100사이의 3 배수이지만 5의 배수의 총합 : "+a);



}
}
