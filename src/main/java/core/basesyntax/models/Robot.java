package fch.models;

import java.util.Random;

public class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot() {
        this.x = new Random().nextInt();
        this.y = new Random().nextInt();
        this.direction = Direction.values()[new Random().nextInt(Direction.values().length)];
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch(direction) {
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
        switch(direction) {
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
        switch(direction) {
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
            case LEFT:
                x--;
                break;
            case RIGHT:
                x++;
                break;
            default:
                break;
        }
    }
}
