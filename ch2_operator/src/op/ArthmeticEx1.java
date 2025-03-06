package op;

public class ArthmeticEx1 {
    public static void main(String[] args) {
        //  +, -, *, /(몫)
        int a = 10;
        int b = 4;
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
