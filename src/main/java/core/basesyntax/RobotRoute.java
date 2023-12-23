package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        System.out.println("Current robot's direction is : " + robot.getDirection());
        System.out.println("Curren robots coordinates are : " + robot.getX() + ", " + robot.getY());
        if (toX == robot.getX() && toY == robot.getY()) {
            System.out.println("Robot no doesn't need to move or has got the target point");
        } else {
            changeDirection(robot, toX, toY);
            robot.stepForward();
            moveRobot(robot,toX,toY);
        }
    }

    public void changeDirection(Robot robot, int toX, int toY) {
        Direction currentDirection = robot.getDirection();
        int currentCoordinateX = robot.getX();
        int currentCoordinateY = robot.getY();
        switch (currentDirection) {
            case UP -> {
                if (toX < currentCoordinateX) {
                    robot.turnLeft();
                }
                if (toX > currentCoordinateX) {
                    robot.turnRight();
                }
            }
            case LEFT -> {
                if (toY > currentCoordinateY) {
                    robot.turnRight();
                }
                if (toY < currentCoordinateY) {
                    robot.turnLeft();
                }
            }
            case DOWN -> {
                if (toX > currentCoordinateX) {
                    robot.turnLeft();
                }
                if (toX < currentCoordinateX) {
                    robot.turnRight();
                }
            }
            case RIGHT -> {
                if (toY > currentCoordinateY) {
                    robot.turnLeft();
                }
                if (toY < currentCoordinateY) {
                    robot.turnRight();
                }
            }
            default -> robot.setDirection(currentDirection);
        }
    }
}
