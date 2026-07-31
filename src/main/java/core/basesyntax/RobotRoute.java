package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        start(robot, toX, toY);

        if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
        }

        if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }

        while (robot.getX() != toX) {
            robot.stepForward();
            printPosition(robot);
        }

        if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
        }

        if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }

        while (robot.getY() != toY) {
            robot.stepForward();
            printPosition(robot);
        }

        finish(robot, toX, toY);
    }

    private void printPosition(Robot robot) {

        System.out.println("Now I'm on position: " + robot.getX() + " " + robot.getY());
    }

    private void start(Robot robot, int toX, int toY) {
        System.out.println("Hi, my start position on: "
                + robot.getX() + " "
                + robot.getY() + "\n"
                + "I'm going to come home on: " + toX + " " + toY);
    }

    private void finish(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() == toY) {
            System.out.println("I finished my way on: " + robot.getX() + " " + robot.getY());
        }
    }
}
