package abstractclass;

public abstract class Player {
    boolean pause;
    int currentPos;

    Player() {
        pause = false;
        currentPos = 0;
    }

    // 추상메서드
    abstract void play();

    void pause() {

    }
}

class CDPlayer extends Player {

    @Override
    void play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("CD 플레이어");
    }
}

class AudioPlayer extends Player {

    @Override
    void play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Audio 플레이어");
    }
}
