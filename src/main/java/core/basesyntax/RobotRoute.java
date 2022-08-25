package core.basesyntax;

public class RobotRoute {

    private void checkX(Robot robot, int x) {
        Direction direction;

        if(x < robot.getX()) {

            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case RIGHT:
                    robot.turnRobot();
                    break;
                case DOWN:
                    robot.turnRight();
                    break;
                case LEFT:
                    direction = Direction.LEFT;
                    break;
                default: break;
            }
        }
        if(x > robot.getX()) {

            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case RIGHT:
                    direction = Direction.RIGHT;
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    robot.turnRobot();
                    break;
                default: break;
            }
        }
    }

    private void checkY(Robot robot, int y) {
        Direction direction;

        if(y < robot.getY()){

            switch (robot.getDirection()) {
                case UP : robot.turnRobot();
                break;
                case RIGHT: robot.turnRight();
                break;
                case LEFT: robot.turnLeft();
                break;
                case DOWN: direction = Direction.DOWN;
                break;
                default: break;
            }
        }

        if(y > robot.getY()) {

            switch (robot.getDirection()) {
                case UP: direction = Direction.UP;
                break;
                case DOWN: robot.turnRobot();
                break;
                case LEFT: robot.turnRight();
                break;
                case RIGHT: robot.turnLeft();
                break;
                default: break;
            }
        }
    }

    public void movingAroundMap(Robot robot, int toX, int toY) {
        int x = toX + (robot.getX() * -1);
        int y = toY + (robot.getY() * -1);
        int motor1 = 0;
        if(x < 0) {motor1 = -1 * x;}
        motor1 = x;
        int motor2 = 0;
        if(y < 0) {motor2 = -1 * y;}
        motor2 = y;
        checkX(robot,toX);
        for (int i = 0; i < motor1; i++) {
            System.out.println("Step " + robot.stepForward() + " Robot ==> " + (i + 1) +
                    " X " + "coordinates" + "(" + robot.getX() + "," + robot.getY() + ")");
        }
        checkY(robot,toY);
        for (int j = 0; j < motor2; j++) {
            System.out.println("Step " + robot.stepForward() + " Robot ==> " + (j + 1) +
                    " Y " + "coordinates" + "(" + robot.getX() + "," + robot.getY() + ")");
        }
    }

    public void moveRobot(Robot robot, int toX, int toY) {
        movingAroundMap(robot, toX, toY);
    }
}
