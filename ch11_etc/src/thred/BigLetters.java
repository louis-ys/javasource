package thred;

public class BigLetters {
    public static void main(String[] args) {
        // 대문자만 출력
        Thread t1 = new SmallLetters2();
        System.out.println("스레드 t1 name " + t1.getName());
        t1.start();

        Thread t2 = new Numprint();
        System.out.println("스레드 t2 name " + t2.getName());
        t2.start();

        Thread mainThread = Thread.currentThread();
        System.out.println("스레드 main name " + mainThread.getName());

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + "\t");

        }

    }

}
