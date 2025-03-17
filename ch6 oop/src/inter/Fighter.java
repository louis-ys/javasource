package inter;

import java.util.Scanner;

public class Fighter extends Unit implements Fightable {

    Scanner sc;

    String msg;

    @Override
    public void move(int x, int y) {
        // TODO Auto-generated method stub
        Math.random();
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    @Override
    public void attack(Unit unit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");

    }

}
