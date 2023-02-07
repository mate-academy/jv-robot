package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        System.out.println("Final destination: " + toX + " : " + toY);
        Direction requiredDir = Direction.UP;
        boolean turnedCorrectWay;
        int cycle = 0;

        while (robot.getX() != toX || robot.getY() != toY) {
            cycle++;
            System.out.println();
            System.out.println("cycle: " + cycle);
            int currentX = robot.getX();
            int currentY = robot.getY();
            Direction currentDir = robot.getDirection();
            System.out.println("Current X: " + currentX
                    + "/n"
                    + "Current Y: " + currentY
                    + "/n"
                    + "Current direction: " + currentDir);
            if (currentX > toX) {
                requiredDir = Direction.LEFT;
            } else if (currentX < toX) {
                requiredDir = Direction.RIGHT;
            } else if (currentY > toY) {
                requiredDir = Direction.DOWN;
            } else if (currentY < toY) {
                requiredDir = Direction.UP;
            }
            if (currentDir != requiredDir) {
                robot.turnLeft();
                turnedCorrectWay = false;
            } else {
                turnedCorrectWay = true;
            }
            if (turnedCorrectWay) {
                robot.stepForward();
            }
        }
        System.out.println("Destination reached");
    }
}
