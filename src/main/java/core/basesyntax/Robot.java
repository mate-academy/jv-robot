package core.basesyntax;

public class Robot {
    private Direction direction;
    private int coordinateX;
    private int coordinateY;

    public Robot(Direction direction, int coordinateX, int coordinateY) {
        this.direction = direction;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
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

    private void turnLeft() {
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

    private void stepForward() {
        switch (direction) {
            case UP:
                coordinateY++;
                break;
            case LEFT:
                coordinateX--;
                break;
            case DOWN:
                coordinateY--;
                break;
            case RIGHT:
                coordinateX++;
                break;
            default:
                break;
        }
    }

    public void goLeft(int toX) {
        while (getDirection() != Direction.LEFT) {
            turnLeft();
        }
        while (toX != getX()) {
            stepForward();
        }
    }

    public void goRight(int toX) {
        while (getDirection() != Direction.RIGHT) {
            turnLeft();
        }
        while (toX != getX()) {
            stepForward();
        }
    }

    public void goDown(int toY) {
        while (getDirection() != Direction.DOWN) {
            turnLeft();
        }
        while (toY != getY()) {
            stepForward();
        }
    }

    public void goUp(int toY) {
        while (getDirection() != Direction.UP) {
            turnLeft();
        }
        while (toY != getY()) {
            stepForward();
        }
    }
}
