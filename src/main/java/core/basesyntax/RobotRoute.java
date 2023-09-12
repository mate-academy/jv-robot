package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        int currentX = robot.getX();
        int currentY = robot.getY();

        int deltaX = toX - currentX;
        int deltaY = toY - currentY;

        if (deltaX > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            for (int i = 0; i < deltaX; i++) {
                robot.stepForward();
            }
        } else if (deltaX < 0) {
            while (robot.getDirection() != Direction.LEFT){
                robot.turnRight();
            }
            for (int i = 0; i < -deltaX; i++) {
                robot.stepForward();
            }
        }

        if (deltaY > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            for (int i = 0; i < deltaY; i++) {
                robot.stepForward();
            }
        } else if (deltaY < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            for (int i = 0; i < -deltaY; i++) {
                robot.stepForward();
            }
        }
    }
}
