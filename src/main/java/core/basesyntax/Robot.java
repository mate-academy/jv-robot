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

    public void ifXmoreToX(int toX, int toY) {
        if (getX() > toX) {
            while (!getDirection().equals(Direction.LEFT)) {
                turnLeft();
            }
            while (getX() != toX) {
                stepForward();
            }
            if (getY() > toY) {
                turnLeft();
                while (getY() != toY) {
                    stepForward();
                }
            } else if (getY() < toY) {
                turnRight();
                while (getY() != toY) {
                    stepForward();
                }
            }
        }
    }

    public void ifXlessToX(int toX, int toY) {
        if (getX() < toX) {
            while (!getDirection().equals(Direction.RIGHT)) {
                turnRight();
            }
            while (getX() != toX) {
                stepForward();
            }
            if (getY() > toY) {
                turnRight();
                while (getY() != toY) {
                    stepForward();
                }
            } else if (getY() < toY) {
                turnLeft();
                while (getY() != toY) {
                    stepForward();
                }
            }
        }
    }

    public void ifXequalsToX(int toX, int toY) {
        if (getX() == toX) {
            if (getY() > toY) {
                while (!getDirection().equals(Direction.DOWN)) {
                    turnRight();
                }
                while (getY() != toY) {
                    stepForward();
                }
            } else if (getY() < toY) {
                while (!getDirection().equals(Direction.UP)) {
                    turnLeft();
                }
                while (getY() != toY) {
                    stepForward();
                }
            }
        }
    }

    public void ifYequalsToY(int toX, int toY) {
        if (getY() == toY) {
            if (getX() > toX) {
                while (!getDirection().equals(Direction.LEFT)) {
                    turnLeft();
                }
                while (getX() != toX) {
                    stepForward();
                }
            } else if (getX() < toX) {
                while (!getDirection().equals(Direction.RIGHT)) {
                    turnRight();
                }
                while (getX() != toX) {
                    stepForward();
                }
            }
        }
    }
}
