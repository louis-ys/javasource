package ch1;

// 변수의 유효범위
// 블럭 {} 안에서 선언된 변수는 {} 벗아난 곳에서는 사용 불가
public class ScopeEx1 {
    public static void main(String[] args) {

        int a = 100;
        {
            int x =10;
            System.out.println("x="+x);
            System.out.println("x="+a);

        }
        // System.out.println("x="+x);

        System.out.println("a="+a);

        if (a < 300) {
            int sum = 0;
            
        }

        for (int i = 0; i < args.length; i++) {
            
        }
        // System.out.println(i);
    }
    
}
