package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        while (( robot.getX()!= toX) | ( robot.getY()!= toY))
        {
            if (toX > robot.getX())
            {
                while (robot.getDirection()!= Direction.RIGHT)
                {
                    robot.turnRight();
                }
                while (robot.getX()!= toX) {
                    robot.stepForward();
                }
                System.out.println(robot.getX());
            }
            else if (toX < robot.getX())
            {
                while (robot.getDirection () != Direction.LEFT)
                {
                    robot.turnRight();
                }
                while (robot.getX()!= toX) {
                    robot.stepForward();
                }
                System.out.println(robot.getX());
            }
            if (toY > robot.getY())
            {
                while (robot.getDirection () != Direction.UP)
                {
                    robot.turnRight();
                }
                while (robot.getY()!= toY) {
                    robot.stepForward();
                }
                System.out.println(robot.getY());
            }
            if (toY < robot.getY())
            {
                while (robot.getDirection () != Direction.DOWN)
                {
                    robot.turnRight();
                }

                while (robot.getY()!= toY) {
                    robot.stepForward();
                }
                System.out.println(robot.getY());
            }
            System.out.println("Robot in position X = " +robot.getX()+ " Y=" + robot.getY());

        }
    }
}
