package op;

public class ArthmeticEx2 {
    public static void main(String[] args) {
    
        // 변수 선언
        //  +, -, *, /(몫)
        byte a = 10;
        byte b = 4;
        //  byte,short 연산 수행 시 연산의 결과가 int 형으로 변경 됨
        // byte c = a + b;
        // 해결책 1)
        // int c = a + b;

        //  해결책 2)  결과값이 -128 ~ 127 사이라면 
        // byte c + (byte)(a + b);

        System.out.printf("%d + %d = %d\n",a, b, a+b);
        System.out.printf("%d - %d = %d\n",a, b, a-b);
        System.out.printf("%d * %d = %d\n",a, b, a*b);
        System.out.printf("%d / %d = %d\n",a, b, a/b);
        System.out.printf("%d / %f = %f\n",a, (float)b,a/(float)b);
        

        // 소수점 표현 타입  float, double
        // a/(float)b == 10/4.000000   
        // a(int) / b(float) : 타입이 다른 경우 연산 시 큰 쪽으로 변환
        // int (4)  < float (4) 같은 4byte지만 float가 더 큼 
    }
}
