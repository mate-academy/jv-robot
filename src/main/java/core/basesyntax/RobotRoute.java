package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (toX > robot.getX()){
            switch (robot.getDirection()) {
                case UP:
                case DOWN:
                    robot.turnRight();
                    break;
                case LEFT:
                    robot.turnRight();
                    robot.turnRight();
                    break;
                default:
                    break;
            }
        }
       if (toX < robot.getX()) {
           switch (robot.getDirection()) {
               case UP:
               case DOWN:
                   robot.turnLeft();
                   break;
               case RIGHT:
                   robot.turnLeft();
                   robot.turnLeft();
                   break;
               default:
                   break;
           }
       }
       while (robot.getX() != toX) {
           robot.stepForward();
       }

       if (toY > robot.getY()) {
           switch (robot.getDirection()) {
               case RIGHT:
                   robot.turnLeft();
                   break;
               case LEFT:
                    robot.turnRight();
                    break;
               case DOWN:
                   robot.turnRight();
                   robot.turnRight();
                   break;
               default:
                   break;
           }
       }
       if (toY < robot.getY()) {
           switch (robot.getDirection()) {
               case LEFT:
                   robot.turnLeft();
                   break;
               case RIGHT:
                   robot.turnRight();
                   break;
               case UP:
                   robot.turnRight();
                   robot.turnRight();
                   break;
               default:
                   break;
           }
       }
       while (robot.getY() != toY) {
           robot.stepForward();
       }
    }
}
