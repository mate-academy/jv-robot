package core.basesyntax;

class RobotRoute {
    void moveRobot(Robot robot, int toX, int toY) {
        if(robot.getX() > toX){
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        }else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        if(robot.getY() > toY){
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }
}
