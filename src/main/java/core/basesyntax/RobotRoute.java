package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        Robot bender = new Robot(Direction.UP, 5,5);
        int stepX = 5;
        for (int i = 0; stepX == toX; i++) {
            if (toX > 5) {
                bender.turnRight();
                bender.stepForward();
                stepX++;
            }
            if (toX < 5) {
                bender.turnLeft();
                bender.stepForward();
                stepX--;
            }
        }
        Robot newBender = new Robot(Direction.UP, stepX,5);
        int stepY = 5;
        for (int i = 0; stepY == toY; i++) {
            if (toY > 5) {
                bender.stepForward();
                stepX++;
            }
            if (toX < 5) {
                bender.turnLeft();
                bender.turnLeft();
                bender.stepForward();
                stepX--;
            }
        }
    }
}
