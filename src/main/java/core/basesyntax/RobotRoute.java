package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX < robot.getX()) {
            switch (robot.getDirection().name()) {
                case "RIGHT":
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case "UP":
                    robot.turnLeft();
                    break;
                case "DOWN":
                    robot.turnRight();
                    break;
                default:break;
            }
        } else if (toX > robot.getX()) {
            switch (robot.getDirection().name()) {
                case "LEFT":
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case "UP":
                    robot.turnRight();
                    break;
                case "DOWN":
                    robot.turnLeft();
                    break;
                default:break;
            }
        }
        while (toX != robot.getX()) {
            robot.stepForward();
        }

        if (toY < robot.getY()) {
            switch (robot.getDirection().name()) {
                case "RIGHT":
                    robot.turnRight();
                    break;
                case "LEFT":
                    robot.turnLeft();
                    break;
                case "UP":
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                default:break;
            }
        } else if (toY > robot.getY()) {
            switch (robot.getDirection().name()) {
                case "LEFT":
                    robot.turnRight();
                    break;
                case "RIGHT":
                    robot.turnLeft();
                    break;
                case "DOWN":
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                default:break;
            }
        }
        while (toY != robot.getY()) {
            robot.stepForward();
        }
    }
}
