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

    public void moveDown() {
        switch (getDirection()) {
            case RIGHT:
                turnLeft();
                turnLeft();
                turnLeft();
                break;
            case UP:
                turnLeft();
                turnLeft();
                break;
            case LEFT:
                turnLeft();
                break;
            case DOWN:
            default:
                break;
        }
    }

    public void moveUp() {
        switch (getDirection()) {
            case LEFT:
                turnLeft();
                turnLeft();
                turnLeft();
                break;
            case DOWN:
                turnLeft();
                turnLeft();
                break;
            case RIGHT:
                turnLeft();
                break;
            case UP:
            default:
                break;
        }
    }

    public void moveRight() {
        switch (getDirection()) {
            case UP:
                turnLeft();
                turnLeft();
                turnLeft();
                break;
            case LEFT:
                turnLeft();
                turnLeft();
                break;
            case DOWN:
                turnLeft();
                break;
            case RIGHT:
            default:
                break;
        }
    }

    public void moveLeft() {
        switch (getDirection()) {
            case DOWN:
                turnLeft();
                turnLeft();
                turnLeft();
                break;
            case RIGHT:
                turnLeft();
                turnLeft();
                break;
            case UP:
                turnLeft();
                break;
            case LEFT:
            default:
                break;
        }
    }
}
