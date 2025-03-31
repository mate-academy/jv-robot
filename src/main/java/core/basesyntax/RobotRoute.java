package core.basesyntax;


public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        switch (robot.getDirection()) {
            case UP:
                if (toY > robot.getY()) {
                    while (robot.getY() < toY) {
                        robot.stepForward();
                    }
                } else if (toY < robot.getY()) {

                    robot.turnRight();
                    robot.turnRight();
                    while (robot.getY() > toY) {
                        robot.stepForward();
                    }
                }
                break;
                
            case DOWN:
                if (toY < robot.getY()) {
                    while (robot.getY() > toY) {
                        robot.stepForward();
                    }
                } else if (toY > robot.getY()) {

                    robot.turnRight();
                    robot.turnRight();
                    while (robot.getY() < toY) {
                        robot.stepForward();
                    }
                }
                break;

            case LEFT:
                if (toX < robot.getX()) {
                    while (robot.getX() > toX) {
                        robot.stepForward();
                    }
                } else if (toX > robot.getX()) {

                    robot.turnRight();
                    while (robot.getX() < toX) {
                        robot.stepForward();
                    }


                }
                break;

            case RIGHT:
                if (toX > robot.getX()) {

                    while (robot.getX() < toX) {
                        robot.stepForward();
                    }
                } else if (toX < robot.getX()) {

                    robot.turnLeft();
                    robot.turnLeft();
                    while (robot.getX() > toX) {
                        robot.stepForward();
                    }
                }
                break;

        }

        

    }
}
