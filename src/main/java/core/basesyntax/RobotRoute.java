package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int robotPositionX = robot.getX();
        int robotPositionY = robot.getY();

        if (robotPositionX > toX) {
            int stepsX = robotPositionX - toX;
            switch (robot.getDirection()) {
                case LEFT : robot.stepForward(stepsX);
                    break;
                case RIGHT:
                case UP:
                case DOWN: do {
                        robot.turnLeft();
                    } while (robot.getDirection() != Direction.LEFT);
                    robot.stepForward(stepsX);
                    break;
                default:
                    System.out.println("Set direction for robot!");
            }
        }

        if (robotPositionX < toX) {
            int stepsX = toX - robotPositionX;
            switch (robot.getDirection()) {
                case RIGHT: robot.stepForward(stepsX);
                    break;
                case LEFT:
                case UP:
                case DOWN: do {
                        robot.turnLeft();
                    } while (robot.getDirection() != Direction.RIGHT);
                    robot.stepForward(stepsX);
                    break;
                default:
                    System.out.println("Set direction for robot!");
            }
        }

        if (robotPositionY > toY) {
            int stepsY = robotPositionY - toY;
            switch (robot.getDirection()) {
                case RIGHT:
                case UP:
                case LEFT: do {
                        robot.turnLeft();
                    } while (robot.getDirection() != Direction.DOWN);
                    robot.stepForward(stepsY);
                    break;
                case DOWN: robot.stepForward(stepsY);
                    break;
                default:
                    System.out.println("Set direction for robot!");
            }
        }

        if (robotPositionY < toY) {
            int stepsY = toY - robotPositionY;
            switch (robot.getDirection()) {
                case UP: robot.stepForward(stepsY);
                    break;
                case LEFT:
                case DOWN:
                case RIGHT: do {
                        robot.turnLeft();
                    } while (robot.getDirection() != Direction.UP);
                    robot.stepForward(stepsY);
                    break;
                default:
                    System.out.println("Set direction for robot!");
            }
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP,-2,-4);
        RobotRoute route = new RobotRoute();
        route.moveRobot(robot, 32, 12);
        System.out.println("Robot's final X position is " + robot.getX()
                           + ", final Y position is " + robot.getY()
                           + " and direction is " + robot.getDirection());
    }
}

