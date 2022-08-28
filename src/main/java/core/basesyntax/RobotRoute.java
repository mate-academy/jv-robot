package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int y = robot.getY();
        int x = robot.getX();
        Direction direction = robot.getDirection();
        if (toX < x) {
            if (direction.equals(Direction.RIGHT)) {
                robot.turnLeft();
                robot.turnLeft();
                int abs = Math.abs(x - toX);
                for (int i = 0; i < abs; i++) {
                    robot.stepForward();
                }
                if (toY < y) {
                    robot.turnLeft();
                    int abs1 = Math.abs(y - toY);
                    for (int i = 0; i < abs1; i++) {
                        robot.stepForward();
                    }
                }
                if (toY > y) {
                    robot.turnRight();
                    int abs1 = Math.abs(y - toY);
                    for (int i = 0; i < abs1; i++) {
                        robot.stepForward();
                    }
                }
            }
            if (direction.equals(Direction.UP)) {
                robot.turnLeft();
                int abs = Math.abs(x - toX);
                for (int i = 0; i < abs; i++) {
                    robot.stepForward();
                }
                if (toY < y) {
                    robot.turnLeft();
                    int abs1 = Math.abs(y - toY);
                    for (int i = 0; i < abs1; i++) {
                        robot.stepForward();
                    }
                }
                if (toY > y) {
                    robot.turnRight();
                    int abs1 = Math.abs(y - toY);
                    for (int i = 0; i < abs1; i++) {
                        robot.stepForward();
                    }
                }
            }
            if (direction.equals(Direction.DOWN)) {
                robot.turnRight();
                int abs = Math.abs(x - toX);
                for (int i = 0; i < abs; i++) {
                    robot.stepForward();
                }
                if (toY < y) {
                    robot.turnLeft();
                    int abs1 = Math.abs(y - toY);
                    for (int i = 0; i < abs1; i++) {
                        robot.stepForward();
                    }
                }
                if (toY > y) {
                    robot.turnRight();
                    int abs1 = Math.abs(y - toY);
                    for (int i = 0; i < abs1; i++) {
                        robot.stepForward();
                    }
                }
            }
            if (direction.equals(Direction.LEFT)) {
                int abs = Math.abs(x - toX);
                for (int i = 0; i < abs; i++) {
                    robot.stepForward();
                }
                if (toY < y) {
                    robot.turnLeft();
                    int abs1 = Math.abs(y - toY);
                    for (int i = 0; i < abs1; i++) {
                        robot.stepForward();
                    }
                }
                if (toY > y) {
                    robot.turnRight();
                    int abs1 = Math.abs(y - toY);
                    for (int i = 0; i < abs1; i++) {
                        robot.stepForward();
                    }
                }
            }
        }
        if (toX > x) {
            if (direction.equals(Direction.RIGHT)) {
                int abs = Math.abs(x - toX);
                for (int i = 0; i < abs; i++) {
                    robot.stepForward();
                }
                if (toY < y) {
                    robot.turnRight();
                    int abs1 = Math.abs(y - toY);
                    for (int i = 0; i < abs1; i++) {
                        robot.stepForward();
                    }
                }
                if (toY > y) {
                    robot.turnLeft();
                    int abs1 = Math.abs(y - toY);
                    for (int i = 0; i < abs1; i++) {
                        robot.stepForward();
                    }
                }
            }
            if (direction.equals(Direction.UP)) {
                robot.turnRight();
                int abs = Math.abs(x - toX);
                for (int i = 0; i < abs; i++) {
                    robot.stepForward();
                }
                if (toY < y) {
                    robot.turnRight();
                    int abs1 = Math.abs(y - toY);
                    for (int i = 0; i < abs1; i++) {
                        robot.stepForward();
                    }
                }
                if (toY > y) {
                    robot.turnLeft();
                    int abs1 = Math.abs(y - toY);
                    for (int i = 0; i < abs1; i++) {
                        robot.stepForward();
                    }
                }
            }
            if (direction.equals(Direction.DOWN)) {
                robot.turnLeft();
                int abs = Math.abs(x - toX);
                for (int i = 0; i < abs; i++) {
                    robot.stepForward();
                }
                if (toY < y) {
                    robot.turnRight();
                    int abs1 = Math.abs(y - toY);
                    for (int i = 0; i < abs1; i++) {
                        robot.stepForward();
                    }
                }
                if (toY > y) {
                    robot.turnLeft();
                    int abs1 = Math.abs(y - toY);
                    for (int i = 0; i < abs1; i++) {
                        robot.stepForward();
                    }
                }
            }
            if (direction.equals(Direction.LEFT)) {
                robot.turnRight();
                robot.turnRight();
                int abs = Math.abs(x - toX);
                for (int i = 0; i < abs; i++) {
                    robot.stepForward();
                }
                if (toY < y) {
                    robot.turnRight();
                    int abs1 = Math.abs(y - toY);
                    for (int i = 0; i < abs1; i++) {
                        robot.stepForward();
                    }
                }
                if (toY > y) {
                    robot.turnLeft();
                    int abs1 = Math.abs(y - toY);
                    for (int i = 0; i < abs1; i++) {
                        robot.stepForward();
                    }
                }
            }
        }
        if (toX == x) {
            if (toY > y) {
                if (direction.equals(Direction.UP)) {
                    int abs = Math.abs(y - toY);
                    for (int i = 0; i < abs; i++) {
                        robot.stepForward();
                    }
                }
                if (direction.equals(Direction.RIGHT)) {
                    robot.turnLeft();
                    int abs = Math.abs(y - toY);
                    for (int i = 0; i < abs; i++) {
                        robot.stepForward();
                    }
                }
                if (direction.equals(Direction.LEFT)) {
                    robot.turnRight();
                    int abs = Math.abs(y - toY);
                    for (int i = 0; i < abs; i++) {
                        robot.stepForward();
                    }
                }
                if (direction.equals(Direction.DOWN)) {
                    robot.turnRight();
                    robot.turnRight();
                    int abs = Math.abs(y - toY);
                    for (int i = 0; i < abs; i++) {
                        robot.stepForward();
                    }
                }
            }
            if (toY < y) {
                if (direction.equals(Direction.UP)) {
                    robot.turnRight();
                    robot.turnRight();
                    int abs = Math.abs(y - toY);
                    for (int i = 0; i < abs; i++) {
                        robot.stepForward();
                    }
                }
                if (direction.equals(Direction.RIGHT)) {
                    robot.turnRight();
                    int abs = Math.abs(y - toY);
                    for (int i = 0; i < abs; i++) {
                        robot.stepForward();
                    }
                }
                if (direction.equals(Direction.LEFT)) {
                    robot.turnLeft();
                    int abs = Math.abs(y - toY);
                    for (int i = 0; i < abs; i++) {
                        robot.stepForward();
                    }
                }
                if (direction.equals(Direction.DOWN)) {
                    int abs = Math.abs(y - toY);
                    for (int i = 0; i < abs; i++) {
                        robot.stepForward();
                    }
                }
            }
        }
    }
}