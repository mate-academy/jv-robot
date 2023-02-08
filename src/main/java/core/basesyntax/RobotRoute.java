package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        RandomPosition randomPosition = new RandomPosition();
        int startX = randomPosition.getRandomStartX();
        int startY = randomPosition.getRandomStartY();
        Direction startDirection = randomPosition.getRandomDirection();

        robot = new Robot(startDirection, startX, startY);
        toX = randomPosition.getRandomEndX();
        toY = randomPosition.getRandomEndY();

        if (startX > toX) {
            while (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            }
            while (startX == toX) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }
            while (startX == toX) {
                robot.stepForward();
            }
        }
        if (startY > toY) {
            while (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            }
            while (startY == toY) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            }
            while (startY == toY) {
                robot.stepForward();
            }
        }
    }
}
