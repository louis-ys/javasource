package inter;

public class RemoteControlEx {
    public static void main(String[] args) {

        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(8);
        rc.setMute(true);
        rc.turnOff();

        RemoteControl.changBattery();
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(8);
        rc.turnOff();

        // 익명 구현 클래스
        rc = new RemoteControl() {

            private int volume;

            @Override
            public void turnOn() {

            }

            @Override
            public void turnOff() {

            }

            @Override
            public void setVolume(int Volume) {
                if (volume > RemoteControl.MAX_VOLUME) {
                    this.volume = RemoteControl.MAX_VOLUME;
                } else if (volume < RemoteControl.MIN_VOLUME) {
                    this.volume = RemoteControl.MIN_VOLUME;
                } else {
                    this.volume = volume;
                }
                System.out.println("현재 Tv 볼륨 : " + this.volume);
            }

        };

    }

}
