package poly;

public class ChildEx {
    public static void main(String[] args) {
        Child child1 = new Child();
        Parent parent = new Child();
        // child1.method1();
        // child1.method2();

        // parent 접근 법위
        parent.method1();
        parent.method2();

        // 부모 = 자식 (0)
        Child child2 = (Child) parent;
        child2.method3();

        // 자식 = 부모 (x)
        Parent parent2 = new Parent();
        child2 = (Child) parent2;
        child2.method3();
        // parent.method3();
    }

}
