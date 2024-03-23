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
            case UP -> direction = Direction.LEFT;
            case LEFT -> direction = Direction.DOWN;
            case DOWN -> direction = Direction.RIGHT;
            case RIGHT -> direction = Direction.UP;
            default -> {
            }
        }
    }

    public void turnRight() {
        switch (direction) {
            case UP -> direction = Direction.RIGHT;
            case LEFT -> direction = Direction.UP;
            case DOWN -> direction = Direction.LEFT;
            case RIGHT -> direction = Direction.DOWN;
            default -> {
            }
        }
    }

    public void stepForward() {
        switch (direction) {
            case UP -> coordinateY++;
            case LEFT -> coordinateX--;
            case DOWN -> coordinateY--;
            case RIGHT -> coordinateX++;
            default -> {
            }
        }
    }
}
