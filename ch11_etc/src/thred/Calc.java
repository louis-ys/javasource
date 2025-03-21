package thred;

public class Calc {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory(int memory) {

        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " : " + this.memory);
    }

}
