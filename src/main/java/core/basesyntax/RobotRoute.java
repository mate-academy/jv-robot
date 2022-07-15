package core.basesyntax;

public class RobotRoute {
        public void moveRobot(Robot robot, int toX, int toY) {
            int moveX = Math.abs(toX-robot.getX());
            int moveY = Math.abs(toY-robot.getY());
            Direction directionX = toX <= robot.getX() ? Direction.LEFT :  Direction.RIGHT;
            Direction directionY = toY <= robot.getY() ? Direction.DOWN :  Direction.UP;
            for (int g = 0; g < 2; g++ ) {
                while (!robot.getDirection().equals(directionX)) {
                    robot.turnRight();
                }
                directionX = directionY;
                for (int i = 0; i < moveX; i++) {
                    robot.stepForward();

                }
                moveX = moveY;
            }
        }
    }
