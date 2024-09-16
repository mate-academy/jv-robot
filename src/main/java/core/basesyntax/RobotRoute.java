package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //loop until robot.x not equal toX
        while (robot.getX() != toX) {
            //If robot x is greater than toX pos we should change our direction
            if (robot.getX() > toX) {
                //Checking robot direction until it equal LEFT
                if (!robot.getDirection().equals(Direction.LEFT)) {
                    robot.turnLeft();
                }
                //After robot direction correct we make steps until robot.GetX equal toX position
                if (robot.getDirection().equals(Direction.LEFT)) {
                    robot.stepForward();
                }
                //If robot x is less than toX pos we should change our direction
            } else if (robot.getX() < toX) {
                //Checking robot direction until it equal RIGHT
                if (!robot.getDirection().equals(Direction.RIGHT)) {
                    robot.turnRight();
                }
                //After robot direction correct we make steps until robot.GetX equal toX position
                if (robot.getDirection().equals(Direction.RIGHT)) {
                    robot.stepForward();
                }
            }
        }
        //loop until robot.Y not equal toY
        while (robot.getY() != toY) {
            //If robot Y is greater than toY pos we should change our direction
            if (robot.getY() > toY) {
                //Checking robot direction until it equal DOWN
                if (!robot.getDirection().equals(Direction.DOWN)) {
                    robot.turnRight();
                }
                //After robot direction correct we make steps until robot.GetY equal toY position
                if (robot.getDirection().equals(Direction.DOWN)) {
                    robot.stepForward();
                }
            } else if (robot.getY() < toY) {
                //Checking robot direction until it equal UP
                if (!robot.getDirection().equals(Direction.UP)) {
                    robot.turnRight();
                }
                //After robot direction correct we make steps until robot.GetY equal toY position
                if (robot.getDirection().equals(Direction.UP)) {
                    robot.stepForward();
                }
            }
        }
    }
}
