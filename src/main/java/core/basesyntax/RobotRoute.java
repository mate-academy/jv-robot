package core.basesyntax;

public class RobotRoute {
    public void setRobotDirection(Robot robot, String setDirection) {
        while (!robot.getDirection().name().equals(setDirection)) {
            robot.turnRight();
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        System.out.println("Direction " + robot.getDirection().name());
        System.out.println("X= " + robot.getX() + " -> " + toX + ", Y = " + robot.getY() + " -> " + toY);
        if (robot.getX() > toX) {
            setRobotDirection(robot, "LEFT");
        } else setRobotDirection(robot, "RIGHT");
        while (robot.getX() != toX) {
            robot.stepForward();
        }
         if (robot.getY() < toY) {
            setRobotDirection(robot, "UP");
        } else {
            setRobotDirection(robot, "DOWN");
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
        System.out.println("Direction " + robot.getDirection().name());
        System.out.println("X= " + robot.getX() + " -> " + toX + ", Y = " + robot.getY() + " -> " + toY);
        System.out.println("------------------------------------------------------");
    }
}
