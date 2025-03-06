package ch1;

public class VarFloatEx1 {
    public static void main(String[] args) {
        //  소수점 형태의 숫자를 사용 하면 doible 로 인식함
        //  float= double
        //  float(4byte) = double(8byte)  => 불가능  그래서 F뒤에 붙여 설정
        //  float 타입은 f, F 를 붙임
        float score1 = 90.14F;
        //  double 타입도 d,D를 붙임
        double score2 = 98.5D;
        System.out.println("score1 = "+score1);
        System.out.println("score2 = "+score2);
        //  소수점 2째자리까지 표현  (.2)
        System.out.printf("score2 = %.2f\n",score2);
    }
    
}
