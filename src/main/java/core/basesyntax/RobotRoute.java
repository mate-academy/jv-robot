package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Direction firstDirection = robot.getDirection();
        int positionX = robot.getX();
        int positionY = robot.getY();
        while (positionX != toX || positionY != toY) {
            int difX = toX - positionX;
            int difY = toY - positionY;
            if (difX > 0) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                robot.stepForward();
            } else if (difX < 0) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                robot.stepForward();
            } else if (difY > 0) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                robot.stepForward();
            } else if (difY < 0) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                robot.stepForward();
            }

            positionX = robot.getX();
            positionY = robot.getY();
        }
    }
}
