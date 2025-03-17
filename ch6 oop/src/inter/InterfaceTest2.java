package inter;

interface I {
    void methoB();

}

class AA {
    public void methodA(I i) {
        i.methoB();
    }
}

class BB implements I {

    @Override
    public void methoB() {
        System.out.println("methodB()");
    }

}

public class InterfaceTest2 {
    public static void main(String[] args) {
        AA obj1 = new AA();
        obj1.methodA(new BB());

    }

}
