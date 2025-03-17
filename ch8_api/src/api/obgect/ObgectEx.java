package api.obgect;

public class ObgectEx {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        // 주소 값이 같으냐? ( 같은 인스턴스를 가리키고 있느냐)
        System.out.println(object1.equals(object2) ? "같음" : "다름");
        System.out.println(object1 == object2 ? "같음" : "다름");

        System.out.println("Object toString()" + object1.toString());

        Value value1 = new Value(10);
        Value value2 = new Value(10);
        System.out.println("Value toString()" + value1.toString());

        // 부모에게 상속 시 참조변수의 주소값 비교
        System.out.println(value1.equals(value2) ? "value == value2" : "value != value2");

        Person person1 = new Person("홍", "길");
        Person person2 = new Person("홍", "구길");
        // 멤버 변수의 값 비교 equals 재정의

        System.out.println(person1.equals(person2) ? "p1 == p2" : "p1 != p2");
        System.out.println("Value toString()" + person1.toString());
    }

}
