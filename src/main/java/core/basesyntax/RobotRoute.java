package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        int horizontalDistance = toX - robot.getX();
        int verticalDistance = toY - robot.getY();

        if (horizontalDistance != 0) {
            Direction horizontalDirection =
                    horizontalDistance > 0 ? Direction.RIGHT : Direction.LEFT;
            turnRobot(horizontalDirection, robot);
            for (int i = 0; i < Math.abs(horizontalDistance); i++) {
                robot.stepForward();
            }
        }

        if (verticalDistance != 0) {
            Direction verticalDirection = verticalDistance > 0 ? Direction.UP : Direction.DOWN;
            turnRobot(verticalDirection, robot);
            for (int i = 0; i < Math.abs(verticalDistance); i++) {
                robot.stepForward();
            }
        }
    }

    private void turnRobot(Direction direction, Robot robot) {
        if (direction == robot.getDirection()) {
            return;
        }

        switch (robot.getDirection().ordinal() * 10 + direction.ordinal()) {
            case 2:
            case 21:
            case 13:
            case 30:
                robot.turnLeft();
                break;
            case 3:
            case 31:
            case 12:
            case 20:
                robot.turnRight();
                break;
            default:
                robot.turnLeft();
                robot.turnLeft();
                break;
        }
    }
}
