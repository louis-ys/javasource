package oop;

public class TriangleEx {
    // 속성 : 밑변, 높이
    // 기능 : 면적 구하기 ,gerArea()
    public static void main(String[] args) {
        // Triangle triangle = new Triangle();
        Triangle triangle = new Triangle();

        triangle.baseLine = 7;
        triangle.height = 7;

        System.out.println("면적은 :" + triangle.getArea());

        triangle = new Triangle(20, 10);
        System.out.println("면적은 :" + triangle.getArea());
    }
}
