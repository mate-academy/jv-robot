package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int locationX = robot.getX();
        int locationY = robot.getY();
        String sideDirectionX = toX > locationX ? "RIGHT" : "LEFT";
        String sideDirectionY = toY > locationY ? "UP" : "DOWN";
        while (!robot.getDirection().toString().equals(sideDirectionX)) {
            robot.turnRight();
        }
        for (int i = 0; i < Math.abs(locationX - toX); i++) {
            robot.stepForward();
        }

        while (!robot.getDirection().toString().equals(sideDirectionY)) {
            robot.turnLeft();
        }
        for (int i = 0; i < Math.abs(locationY - toY); i++) {
            robot.stepForward();
        }
    }
}
