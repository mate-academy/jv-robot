package core.basesyntax;

public class RobotRoute {

    public void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = robot.getDirection();
        int coordinateX = robot.getX();
        int coordinateY = robot.getY();
        setNewDirection(direction,coordinateX,coordinateY,robot,toX,toY);
    }

    public void setNewDirection(Direction direction, int coordinateX,
                                int coordinateY, Robot robot, int toX, int toY) {
        switch (direction) {
            case RIGHT:
                if (coordinateX < toX) {
                    goToCoordinate(robot, toX - coordinateX, toX, toY);
                    break;
                }
                if (coordinateX > toX) {
                    robot.turnLeft();
                    robot.turnLeft();
                    goToCoordinate(robot, toX - coordinateX, toX, toY);
                    break;
                }
                if (coordinateY < toY) {
                    robot.turnLeft();
                    goToCoordinate(robot, toY - coordinateY, toX, toY);
                    break;
                }
                if (coordinateY > toY) {
                    robot.turnRight();
                    goToCoordinate(robot, toY - coordinateY, toX, toY);
                    break;
                }
            case LEFT:
                if (coordinateX < toX) {
                    robot.turnRight();
                    robot.turnRight();
                    goToCoordinate(robot, toX - coordinateX, toX, toY);
                    break;
                }
                if (coordinateX > toX) {
                    goToCoordinate(robot, toX - coordinateX, toX, toY);
                    break;
                }
                if (coordinateY < toY) {
                    robot.turnRight();
                    goToCoordinate(robot, toY - coordinateY, toX, toY);
                    break;
                }
                if (coordinateY > toY) {
                    robot.turnLeft();
                    goToCoordinate(robot, toY - coordinateY, toX, toY);
                    break;
                }
            case UP:
                if (coordinateX < toX) {
                    robot.turnRight();
                    goToCoordinate(robot, toX - coordinateX, toX, toY);
                    break;
                }
                if (coordinateX > toX) {
                    robot.turnLeft();
                    goToCoordinate(robot, toX - coordinateX, toX, toY);
                    break;
                }
                if (coordinateY < toY) {
                    goToCoordinate(robot, toY - coordinateY, toX, toY);
                    break;
                }
                if (coordinateY > toY) {
                    robot.turnRight();
                    robot.turnRight();
                    goToCoordinate(robot, toY - coordinateY, toX, toY);
                    break;
                }
            case DOWN:
                if (coordinateX < toX) {
                    robot.turnRight();
                    goToCoordinate(robot, toX - coordinateX, toX, toY);
                    break;
                }
                if (coordinateX > toX) {
                    robot.turnLeft();
                    goToCoordinate(robot, toX - coordinateX, toX, toY);
                    break;
                }
                if (coordinateY > toY) {
                    goToCoordinate(robot, toY - coordinateY, toX, toY);
                    break;
                }
                if (coordinateY < toY) {
                    robot.turnRight();
                    robot.turnRight();
                    goToCoordinate(robot, toY - coordinateY, toX, toY);
                    break;
                }

            default:
                System.out.println("Welcome home!!!");
                break;
        }
    }

    public void goToCoordinate(Robot robot, int step, int toX, int toY) {
        step = Math.abs(step);
        for (int i = 0; i < step; i++) {
            robot.stepForward();
        }
        moveRobot(robot,toX,toY);
    }
}
