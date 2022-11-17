package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        final int initialX = robot.getX();
        final int initialY = robot.getY();

        if (robot.getX() < toX) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnRight();
                    break;
                case DOWN:
                    robot.turnLeft();
                    break;
                case LEFT:
                    for (int i = 0; i < 2; i++) {
                        robot.turnRight();
                    }
                    break;                 
                default:
                    break;       
            }
      
            for (int i = 0; i < toX - initialX; i++) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            switch (robot.getDirection()) {
                case UP:
                    robot.turnLeft();
                    break;
                case DOWN:
                    robot.turnRight();;
                    break;
                case RIGHT:
                    for (int i = 0; i < 2; i++) {
                        robot.turnLeft();
                    }
                    break;                 
                default:
                    break;         
            }
      
            for (int i = 0; i < initialX - toX; i++) {
                robot.stepForward();
            }
        }

        if (robot.getY() < toY) {
            switch (robot.getDirection()) {
                case LEFT:
                    robot.turnRight();
                    break;
                case RIGHT:
                    robot.turnLeft();
                    break;
                case DOWN:
                    for (int i = 0; i < 2; i++) {
                        robot.turnRight();
                    }
                    break;
                default:
                    break;          
            }
            
            for (int i = 0; i < toY - initialY; i++) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            switch (robot.getDirection()) {
                case RIGHT:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnLeft();;
                    break;
                case UP:
                    for (int i = 0; i < 2; i++) {
                        robot.turnLeft();
                    }
                    break;
                default:
                    break;          
            }
            
            for (int i = 0; i < initialY - toY; i++) {
                robot.stepForward();
            }
        }
    }
}
