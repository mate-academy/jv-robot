package fch.models;

import java.util.Random;

public class Robot {
    private int X;
    private int Y;
    private Direction direction;

    public Robot() {
        this.X = new Random().nextInt();
        this.Y = new Random().nextInt();
        this.direction = Direction.values()[new Random().nextInt(Direction.values().length)];
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
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
                Y++;
                break;
            case DOWN:
                Y--;
                break;
            case LEFT:
                X--;
                break;
            case RIGHT:
                X++;
                break;
            default:
                break;
        }
    }
}
