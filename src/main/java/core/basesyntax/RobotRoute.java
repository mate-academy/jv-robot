package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        changeMoveDirrection(robot, toX, toY);
        while(true){
            robot.stepForward();
            if(robot.getX() == toX || robot.getY() == toY) {
                break;
            }
        }
        changeMoveDirrection(robot, toX, toY);
        while(true){
            robot.stepForward();
            if((robot.getX() == toX) && (robot.getY() == toY)) {
                break;
            }
        }
    }

    public void changeMoveDirrection(Robot robot, int toX, int toY){
        if ((robot.getX() > toX) && (robot.getY() > toY)) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        } else if ((robot.getX() < toX) && (robot.getY() < toY)) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else if ((robot.getX() > toX) && (robot.getY() < toY)) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        } else if ((robot.getX() < toX) && (robot.getY() > toY)) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else if ((robot.getX() == toX) && (robot.getY() > toY)) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        } else if ((robot.getX() == toX) && (robot.getY() < toY)) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        } else if ((robot.getX() < toX) && (robot.getY() == toY)) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        } else if ((robot.getX() > toX) && (robot.getY() == toY)) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
        }
    }
}
