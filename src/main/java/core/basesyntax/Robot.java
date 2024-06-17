package core.basesyntax;

public class Robot {
    private Direction direction;
    private int x;
    private int Y;

    public Robot(Direction direction, int X, int Y) {
        this.direction = direction;
        this.X = X;
        this.Y = Y;
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
            case LEFT:
                direction = Direction.DOWN;
                break;
            case DOWN:
                direction = Direction.RIGHT;
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
            case LEFT:
                direction = Direction.UP;
                break;
            case DOWN:
                direction = Direction.LEFT;
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
            case LEFT:
                X--;
                break;
            case DOWN:
                Y--;
                break;
            case RIGHT:
                X++;
                break;
            default:
                break;
        }
    }
}
