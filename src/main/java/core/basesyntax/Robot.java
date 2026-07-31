package core.basesyntax;

import java.util.Random;

public class Robot {
    private int coordinateX;
    private int coordinateY;
    private Direction direction;

    public Robot(Direction direction, int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    public Robot() {
        this.coordinateX = new Random().nextInt();
        this.coordinateY = new Random().nextInt();
        this.direction = Direction.values()[new Random().nextInt(Direction.values().length)];
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return coordinateX;
    }

    public int getY() {
        return coordinateY;
    }

    public void turnLeft() {
        switch (direction) {
            case UP:
                direction = Direction.LEFT;
                break;
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case LEFT:
                direction = Direction.DOWN;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
            default:
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case UP:
                direction = Direction.RIGHT;
                break;
            case DOWN:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
            default:
                break;
        }
    }

    public void stepForward() {
        switch (direction) {
            case UP:
                coordinateY++;
                break;
            case DOWN:
                coordinateY--;
                break;
            case LEFT:
                coordinateX--;
                break;
            case RIGHT:
                coordinateX++;
                break;
            default:
                break;
        }
    }
}
