package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here

        int findX = robot.getX();

        int findY = robot.getY();


        if (findX > toX) {

            while (robot.getDirection() != Direction.LEFT) {

                robot.turnLeft();
            }

            for (int i = findX; i > toX; i--) {

                robot.stepForward();

            }
        }

        if (findY > toY) {

            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }

            for (int i = findY; i > toY; i--) {

                    robot.stepForward();

            }
        }

        if (findX < toX) {
            while (robot.getDirection() != Direction.RIGHT) {

                robot.turnRight();
            }

            for (int i = findX; i < toX; i++) {

                robot.stepForward();

            }
        }

        if (findY < toY) {

            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }

            for (int i = findY; i < toY; i++) {

                robot.stepForward();

            }
        }
    }
}
