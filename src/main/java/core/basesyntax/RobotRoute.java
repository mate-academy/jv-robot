package core.basesyntax;

public class RobotRoute {

    private void checkX(Robot robot, int x) {
        Direction direction;
        if (x < robot.getX()) {
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
            }
        }
        if (x > robot.getX()) {
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
            }
        }
    }

    private void checkY(Robot robot , int y){
        Direction direction ;
        if(y < robot.getY()){
            switch (robot.getDirection()){
                case UP : robot.turnRobot();
                break;
                case RIGHT: robot.turnRight();
                break;
                case LEFT: robot.turnLeft();
                break;
                case DOWN: direction = Direction.DOWN
                ;break;
            }
        }
        if(y > robot.getY()) {
            switch (robot.getDirection()) {
                case UP: direction = Direction.UP;
                break;
                case DOWN: robot.turnRobot();
                break;
                case LEFT: robot.turnRight()
                ;break;
                case RIGHT: robot.turnLeft()
                ;break;
            }
        }
    }

    public void movingAroundMap(Robot robot, int toX, int toY) {
        int x = toX + (robot.getX() * -1);
        int y = toY + (robot.getY() * -1);
        int xMotor = 0;
        if (x < 0) {xMotor = -1 * x;} else {xMotor = x;}
        int yMotor = 0;
        if (y < 0) {yMotor = -1 * y;} else {yMotor = y;}
        checkX(robot,toX);
        for (int iX = 0; iX < xMotor; iX++) {
            System.out.println("Step " + robot.stepForward() + " Robot ==> " + (iX + 1) + " X " + "coordinates" + "(" + robot.getX() + "," + robot.getY() + ")");
        }
        checkY(robot,toY);
        for (int iY = 0; iY < yMotor; iY++) {
            System.out.println("Step " + robot.stepForward() + " Robot ==> " + (iY + 1) + " Y " + "coordinates" + "(" + robot.getX() + "," + robot.getY() + ")");
        }}


    public void moveRobot(Robot robot, int toX, int toY) {
        movingAroundMap(robot, toX, toY);
    }
}
