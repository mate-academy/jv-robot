package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnRight();
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case RIGHT:
                default:
                    break;
            }
        }
        if (toX < robot.getX()) {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnRight();
                case DOWN:
                    robot.turnRight();
                    break;
                case UP:
                    robot.turnLeft();
                    break;
                case LEFT:
                default:
                    break;
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if (toY < robot.getY()) {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnRight();
                    break;
                case UP:
                    robot.turnLeft();
                case LEFT:
                    robot.turnLeft();
                    break;
                case DOWN:
                default:
                    break;
            }
        }
        if (toY > robot.getY()) {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnRight();
                    break;
                case UP:
                default:
                    break;
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
        System.out.println("I don`t want to be moving anymore, I just want to be happy");
    }
}
