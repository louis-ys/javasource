package extend;

public class Tv {

    // tv 클래스를 이용해서 Tv 생성
    // 객체 구성요소
    // 1. 속성 => 멥버변수
    // 2. 기능 => 멤버메소드
    // 크기(int), 색상(String), 채널(int),볼름(int)
    // 멤버 변수 mine전에 입력

    public int channel;
    boolean power;

    // 채널 변경 볼륨 변경, 전원켜기, 끄기
    void channelUp() {
        channel++;
    }

    void channelDown() {

        channel--;
    }

    void powr() {
        power = !power;
    }

    @Override
    public String toString() {
        return "Tv [channel=" + channel + ", power=" + power + "]";
    }

}
