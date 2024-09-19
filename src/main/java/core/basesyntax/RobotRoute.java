package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        moveInXDirection(robot, toX);
        moveInYDirection(robot, toY);

    }
        private void moveInXDirection(Robot robot, int toX) {
            while (robot.getX() != toX) {
                if(robot.getX() < toX) {
                    turnRobotDirection(robot, Direction.RIGHT);
                } else {
                    turnRobotDirection(robot, Direction.LEFT);
                }
                robot.stepForward();
        }
    }
        private void moveInYDirection(Robot robot, int toY) {
            while (robot.getY() != toY) {
                if (robot.getY() < toY) {
                    turnRobotDirection(robot, Direction.UP);
                } else {
                    turnRobotDirection(robot, Direction.DOWN);
                }
                robot.stepForward();
            }
        }
        private void turnRobotDirection (Robot robot, Direction targetDirection){
            while (robot.getDirection() != targetDirection){
                robot.turnRight();
                }
            }
        }