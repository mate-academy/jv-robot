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

    public void stepForward(int stepsToMake) {
        for (int i = 1; i <= stepsToMake; i++) {
            this.stepForward();
        }
    }

    public void changeDirection(Direction targetDirection) {
        Direction currentDirection = this.getDirection();
        boolean needMoveToTheRight = needMoveToTheRight(currentDirection, targetDirection);
        while (currentDirection != targetDirection) {
            if (needMoveToTheRight) {
                this.turnRight();
            } else {
                this.turnLeft();
            }
            currentDirection = this.getDirection();
        }
    }

    private boolean needMoveToTheRight(Direction currentDirection, Direction targetDirection) {
        return (currentDirection == Direction.DOWN && targetDirection == Direction.LEFT)
                || (currentDirection == Direction.LEFT && targetDirection == Direction.UP)
                || (currentDirection == Direction.UP && targetDirection == Direction.RIGHT)
                || (currentDirection == Direction.RIGHT && targetDirection == Direction.DOWN);
    }
}
