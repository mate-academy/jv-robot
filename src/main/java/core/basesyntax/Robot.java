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

    public String turnLeft() {
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
        return direction.name();
    }

    public String turnRight() {
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
        return direction.name();
    }

    public String stepForward() {
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
        return direction.name();
    }
    public Direction turnRobot(){
        switch (direction){
            case UP : direction = Direction.DOWN;
                return direction;
            case DOWN : direction = Direction.UP;
                return direction;
            case LEFT : direction = Direction.RIGHT;
                return direction;
            case RIGHT :direction = Direction.LEFT;
                return direction;
        }
        return direction;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "direction=" + direction +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}
