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

    public void defineDirectionX(Robot robot, int toX) {
        int x = robot.getX();
        Direction needDirection = robot.getDirection();
        if (x != toX) {
            if (x > toX) {
                needDirection = Direction.LEFT;
            } else {
                needDirection = Direction.RIGHT;
            }
        }
        while (robot.getDirection() != needDirection) {
            Direction robotDirection = robot.getDirection();
            if (needDirection == Direction.RIGHT) {
                switch (robotDirection) {
                    case UP:
                        robot.turnRight();
                        break;
                    case LEFT:
                    case DOWN:
                        robot.turnLeft();
                        break;
                    default:
                        break;
                }
            }
            if (needDirection == Direction.LEFT) {
                switch (robotDirection) {
                    case RIGHT:
                    case UP:
                        robot.turnLeft();
                        break;
                    case DOWN:
                        robot.turnRight();
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public void defineDirectionY(Robot robot, int toY) {
        int y = robot.getY();
        Direction needDirection = robot.getDirection();
        if (y != toY) {
            if (y > toY) {
                needDirection = Direction.DOWN;
            } else {
                needDirection = Direction.UP;
            }
        }
        while (robot.getDirection() != needDirection) {
            Direction robotDirection = robot.getDirection();
            if (needDirection == Direction.DOWN) {
                switch (robotDirection) {
                    case LEFT:
                    case UP:
                        robot.turnLeft();
                        break;
                    case RIGHT:
                        robot.turnRight();
                        break;
                    default:
                        break;
                }
            }
            if (needDirection == Direction.UP) {
                switch (robotDirection) {
                    case LEFT:
                    case DOWN:
                        robot.turnRight();
                        break;
                    case RIGHT:
                        robot.turnLeft();
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
