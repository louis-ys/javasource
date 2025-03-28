package oop;

//    private  : 외부 클래스에서 접근 불가

public class Tv2 {

    private int size;
    private String color;
    private int channel;
    private int volume;
    private boolean power;

    // 초기화 - 생성자
    public Tv2() {

    }

    public Tv2(int size, String color) {
        this.size = size;
        this.color = color;
    }

    void changechannel(int channel) {
        this.channel = channel;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {

        channel--;
    }

    @Override
    public String toString() {
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                + power + ", toString()=" + super.toString() + "]";
    }

    void powr() {
        power = !power;
    }

}
