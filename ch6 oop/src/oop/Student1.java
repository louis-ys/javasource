package oop;

public class Student1 {
    public static void main(String[] args) {
        // student 인스턴스 생성, 사용
        // 인스턴스 생성 시 생성자 사용
        Student student1 = new Student();
        Student student2 = new Student(1, 5);
        Student student3 = new Student("s123456", "한지민", 1, 3, "010-5488-5899", "han@gmail.com");
        Student student4 = new Student("s129856", "한가인", 3, 7, "010-5987-5970", "hanga@gmail.com");

        // // 개발자 확인용
        // System.out.println(student1);
        // System.out.println(student2);
        // System.out.println(student3);
        // System.out.println(student4);
        studentinfo(student3);
        // System.out.println("===============================");
        // System.out.println("아이디 : " + student3.getStuid());
        // System.out.println("이름 : " + student3.getName());
        // System.out.println("학년 : " + student3.getGrade());
        // System.out.println("반 : " + student3.getClassNum());
        // System.out.println("전화번호 : " + student3.getPhone());
        // System.out.println("이메일 : " + student3.getEmail());
        // System.out.println("===============================");

        System.out.println();
        studentinfo(student4);
        // System.out.println("===============================");
        // System.out.println("아이디 : " + student4.getStuid());
        // System.out.println("이름 : " + student4.getName());
        // System.out.println("학년 : " + student4.getGrade());
        // System.out.println("반 : " + student4.getClassNum());
        // System.out.println("전화번호 : " + student4.getPhone());
        // System.out.println("이메일 : " + student4.getEmail());
        // System.out.println("===============================");

        // 홍실동 학생 전화번호 변경
        student3.changeTel("010-4677-5465");
        System.out.println(student3);
    }

    public static void studentinfo(Student student) {
        System.out.println("===============================");
        System.out.println("아이디 : " + student.getStuid());
        System.out.println("이름 : " + student.getName());
        System.out.println("학년 : " + student.getGrade());
        System.out.println("반 : " + student.getClassNum());
        System.out.println("전화번호 : " + student.getPhone());
        System.out.println("이메일 : " + student.getEmail());
        System.out.println("===============================");

    }

}
