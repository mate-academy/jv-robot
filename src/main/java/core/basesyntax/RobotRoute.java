package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction requiredDir;
        int cycle = 0;

        System.out.println("\nFinal destination: " + toX + " : " + toY);

        while (robot.getX() != toX || robot.getY() != toY) {
            //logging cycle and robot state
            log(robot, cycle);
            //move robot
            requiredDir = findCorrectDirection(robot.getX(), robot.getY(), toX, toY);
            if (turnToRequiredDirection(robot,requiredDir)) {
                robot.stepForward();
            }
        }
        System.out.println("Destination reached");
    }

    private Direction findCorrectDirection(int currentX, int currentY, int toX, int toY) {
        if (currentX > toX) {
            return Direction.LEFT;
        } else if (currentX < toX) {
            return Direction.RIGHT;
        } else if (currentY > toY) {
            return Direction.DOWN;
        } else if (currentY < toY) {
            return Direction.UP;
        } else {
            return null;
        }
    }

    private boolean turnToRequiredDirection(Robot robot, Direction requiredDir) {
        if (robot.getDirection() != requiredDir) {
            robot.turnLeft();
            return false;
        } else {
            return true;
        }
    }

    private void log(Robot robot, int cycle) {
        cycle++;
        System.out.println("\ncycle: " + cycle);
        System.out.println("Current X: " + robot.getX()
                + "/n"
                + "Current Y: " + robot.getY()
                + "/n"
                + "Current direction: " + robot.getDirection());
    }
}
