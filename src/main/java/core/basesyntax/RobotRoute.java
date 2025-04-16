package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
       int distanceToX = toX + robot.getX();
       int distanceToY = toY + robot.getY();

       //to X
       while (robot.getDirection() != Direction.LEFT) {
           robot.turnRight();
       }

       if (robot.getX() != toX) {
           robot.stepForward();
           if (robot.getX() + toX < distanceToX) {
               while (robot.getX() != toX) {
                   robot.stepForward();
               }
               } else {
               while (robot.getDirection() != Direction.RIGHT) {
                   robot.turnRight();
               }
               while (robot.getX() != toX) {
                   robot.stepForward();
               }
           }
       }

       //to Y
       while (robot.getDirection() != Direction.UP) {
           robot.turnRight();
       }

       if (robot.getY() != toY) {
           robot.stepForward();
           if (robot.getY() + toY < distanceToY) {
               while (robot.getY() != toY) {
                   robot.stepForward();
               }
           } else {
               while (robot.getDirection() != Direction.DOWN) {
                   robot.turnRight();
               }
               while (robot.getY() != toY) {
                   robot.stepForward();
               }
           }
       }

    }
}
