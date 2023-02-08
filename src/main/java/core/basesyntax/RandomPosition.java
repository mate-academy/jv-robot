package core.basesyntax;

import java.util.Random;

public class RandomPosition {
    public int getRandomStartX() {
        return new Random().nextInt(10);
    }

    public int getRandomEndX() {
        return new Random().nextInt(10);
    }

    public int getRandomStartY() {
        return new Random().nextInt(10);
    }

    public int getRandomEndY() {
        return new Random().nextInt(10);
    }

    public Direction getRandomDirection() {
        int index = new Random().nextInt(Direction.values().length);
        return Direction.values()[index];
    }
}
