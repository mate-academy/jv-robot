package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int currentXPosition = robot.getX();
        int currentYPosition = robot.getY();

        if (currentXPosition > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            do {
                robot.stepForward();
                currentXPosition--;
            } while (currentXPosition != toX);

        } else if (currentXPosition < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            do {
                robot.stepForward();
                currentXPosition++;
            } while (currentXPosition != toX);
        }

        if (currentYPosition > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight(); //need checking
            }
            do {
                robot.stepForward();
                currentYPosition--;
            } while (currentYPosition != toY);

        } else if (currentYPosition < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight(); //need checking
            }
            do {
                robot.stepForward();
                currentYPosition++;
                System.out.println("Хочу далі вчитись");
            } while (currentYPosition != toY);
        }
    }
}
