package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getX() == toX && robot.getY() == toY) {
            System.out.println("Robot dotarł do celu: X=" + robot.getX() + ", Y=" + robot.getY());
            return;
        }
        while (robot.getX() != toX || robot.getY() != toY) {
            System.out.println("Aktualna pozycja: X=" + robot.getX() + ", Y=" + robot.getY());
            System.out.println("Kierunek: " + robot.getDirection());
            if (robot.getX() < toX) {
                if (robot.getDirection() != Direction.RIGHT) {
                    turnRobotRight(robot);
                }
                robot.stepForward();
                System.out.println("Kierunek X: " + robot.getDirection() + " do X=" + toX);
            } else if (robot.getX() > toX) {
                if (robot.getDirection() != Direction.LEFT) {
                    turnRobotLeft(robot);
                }
                robot.stepForward();
                System.out.println("Kierunek X: " + robot.getDirection() + " do X=" + toX);
            }
            if (robot.getY() < toY) {
                if (robot.getDirection() != Direction.UP) {
                    turnRobotUp(robot);
                }
                robot.stepForward();
                System.out.println("Kierunek Y: " + robot.getDirection() + " do Y=" + toY);
            } else if (robot.getY() > toY) {
                if (robot.getDirection() != Direction.DOWN) {
                    turnRobotDown(robot);
                }
                robot.stepForward();
                System.out.println("Kierunek Y: " + robot.getDirection() + " do Y=" + toY);
            }
        }
    }

    private void turnRobotRight(Robot robot) {
        while (robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
    }

    private void turnRobotLeft(Robot robot) {
        while (robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
    }

    private void turnRobotUp(Robot robot) {
        while (robot.getDirection() != Direction.UP) {
            robot.turnLeft();
            robot.turnLeft();
        }
    }

    private void turnRobotDown(Robot robot) {
        while (robot.getDirection() != Direction.DOWN) {
            robot.turnRight();
            robot.turnRight();
        }
    }
}
