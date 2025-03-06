public class ArrayEx {
    public static void main(String[] args) {
        // 배열
        // 같은 타입의 여러 변수를 하나의 묶음으로 다루는 개념
        // 배열의 크기는 변경 불가
        // 학생 100명의 점수를 입력
        // int [] 배열명 = new int [100]; 배열선언, 생성

        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        int[] scores2 = { 85, 65, 95, 74, 100 };

        // 세 번째 학생 점수가 궁금
        System.out.println(scores2[2]);
        System.out.println("배열 길이 : " + scores2.length);

        // 다섯번째 학생 점수 수정
        scores2[4] = 98;

        System.out.println("다섯번째 학생 : " + scores2[4]);

        System.out.println(scores2[5]); // ArrayIndexOutOfBoundsException 없는 칸 불러오기 오류

    }

}
