package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        Direction kierunek = robot.getDirection();
        if (robot.getX() > toX) {
            for (int i = 0; i <= Direction.values().length; i++) {
                if (kierunek != Direction.LEFT) {
                    robot.turnLeft();
                    kierunek = robot.getDirection();
                } else {
                    for (int j = robot.getX(); j > toX; j--) {
                        robot.stepForward();
                    }
                }
            }
        }
        if (robot.getX() < toX) {
            for (int i = 0; i <= Direction.values().length; i++) {
                if (kierunek != Direction.RIGHT) {
                    robot.turnRight();
                    kierunek = robot.getDirection();
                } else {
                    for (int j = robot.getX(); j < toX; j++) {
                        robot.stepForward();
                    }
                }
            }
        }
        if (robot.getY() < toY) {
            for (int i = 0; i <= Direction.values().length; i++) {
                if (kierunek != Direction.UP) {
                    robot.turnLeft();
                    kierunek = robot.getDirection();
                } else {
                    for (int j = robot.getY(); j < toY; j++) {
                        robot.stepForward();
                    }
                }
            }
        }
        if (robot.getY() > toY) {
            for (int i = 0; i <= Direction.values().length; i++) {
                if (kierunek != Direction.DOWN) {
                    robot.turnLeft();
                    kierunek = robot.getDirection();
                } else {
                    for (int j = robot.getY(); j > toY; j--) {
                        robot.stepForward();
                    }
                }
            }
        }
    }
}
