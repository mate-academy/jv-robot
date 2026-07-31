package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int x = robot.getX();
        int y = robot.getY();

        setDirectionUp(robot);

        while (x != toX || y != toY) {
            //x part
            if (x < toX) {
                robot.turnRight();
                robot.stepForward();
                setDirectionUp(robot);
            } else if (x > toX) {
                robot.turnLeft();
                robot.stepForward();
                setDirectionUp(robot);
            }

            //y part
            if (y < toY) {
                robot.stepForward();
            } else if (y > toY) {
                robot.turnLeft();
                robot.turnLeft();
                robot.stepForward();
                setDirectionUp(robot);
            }

            x = robot.getX();
            y = robot.getY();
        }

    }

    public void setDirectionUp(Robot robot) {

        Direction direction = robot.getDirection();

        if (direction != Direction.UP) {
            switch (direction) {
                case LEFT:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                default:
                    break;
            }
        }
    }
}
