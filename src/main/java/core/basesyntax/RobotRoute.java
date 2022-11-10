package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here


        int xLocation = robot.getX();

        int yLocation = robot.getY();



        if (xLocation > toX) {
            while (robot.getDirection() != Direction.LEFT) {

                robot.turnLeft();
            }


            for (int i = xLocation; i > toX; i--) {

                robot.stepForward();

            }
        }

        if (yLocation > toY) {

            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }

            for (int i = yLocation; i > toY; i--) {

                    robot.stepForward();

            }
        }

        if (xLocation < toX) {
            while (robot.getDirection() != Direction.RIGHT) {

                robot.turnRight();
            }


            for (int i = xLocation; i < toX; i++) {

                robot.stepForward();

            }
        }

        if (yLocation < toY) {

            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }

            for (int i = yLocation; i < toY; i++) {

                robot.stepForward();

            }
        }


    }
}
