package core.basesyntax;

import java.util.Random;

public class RandomPosition {
    public int getRandomX() {
        return new Random().nextInt(100);
    }

    public int getRandomY() {
        return new Random().nextInt(100);
    }

    public Direction getRandomDirection() {
        int index = new Random().nextInt(Direction.values().length);
        return Direction.values()[index];
    }
}
