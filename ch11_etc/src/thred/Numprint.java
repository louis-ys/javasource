package thred;

public class Numprint extends Thread {

    public Numprint() {
        setName("Numprint");
    }

    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            System.out.print(i + "\t");
        }
    }

}
