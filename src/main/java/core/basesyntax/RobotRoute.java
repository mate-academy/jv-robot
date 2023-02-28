package core.basesyntax;

public class  RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        if (robot.getX() > toX){
            turnRobot(robot, Direction.LEFT);
            doSteps(Math.abs(robot.getX() - toX), robot);
        }else if (toX > robot.getX()){
            turnRobot(robot, Direction.RIGHT);
            doSteps(Math.abs(toX - robot.getX()), robot);
        }
        
        if (robot.getY() > toY){
            turnRobot(robot, Direction.DOWN);
            doSteps(Math.abs(robot.getY() - toY), robot);
        } else if (toY > robot.getY()) {
            turnRobot(robot, Direction.UP);
            doSteps(Math.abs(toY - robot.getY()), robot);
        }
    }

    public void doSteps(int numberOfSteps, Robot robot){
        for (int i = 0; i < numberOfSteps; i++) {
            robot.stepForward();
        }
    }

    public void turnRobot(Robot robot, Direction needDirection){
        while (robot.getDirection() != needDirection) {
            turnFromPosition(robot, needDirection);
        }
    }

    public void turnFromPosition(Robot robot, Direction needDirection){
        switch (needDirection){
            case UP:
                if (robot.getDirection() == Direction.LEFT){
                    robot.turnRight();
                }else {
                    robot.turnLeft();
                }
                break;
            case DOWN:
                if (robot.getDirection() == Direction.LEFT){
                    robot.turnLeft();
                }else {
                    robot.turnRight();
                }
                break;
            case RIGHT:
                if (robot.getDirection() == Direction.UP){
                    robot.turnRight();
                }else {
                    robot.turnLeft();
                }
                break;
            case LEFT:
                if (robot.getDirection() == Direction.UP){
                    robot.turnLeft();
                }else {
                    robot.turnLeft();
                }
                break;
            default:
                break;
        }
    }
}
