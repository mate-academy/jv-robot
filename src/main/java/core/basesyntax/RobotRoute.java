package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        int coordinateX = robot.getX();
        int coordinateY = robot.getY();
        if (toX < coordinateX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            for (int i = coordinateX; i > toX; i--) {
                robot.stepForward();
            }
        } else if (toX > coordinateX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            for (int i = coordinateX; i < toX; i++) {
                robot.stepForward();
            }
        }
        if (toY < coordinateY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            for (int i = coordinateY; i > toY; i--) {
                robot.stepForward();
            }
        } else if (toY > coordinateY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            for (int i = coordinateY; i < toY; i++) {
                robot.stepForward();
            }
        }
    }
}
