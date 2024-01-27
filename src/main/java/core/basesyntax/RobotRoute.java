package core.basesyntax;

import static core.basesyntax.Direction.*;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        int axisDiffX = toX - robot.getX();
        int axisDiffY = toY - robot.getY();

        movingByAxisX(robot, axisDiffX);
        movingByAxisY(robot, axisDiffY);

    }

    private void movingByAxisX(Robot robot, int axisDiffX) {

        if ((robot.getDirection() == UP && axisDiffX > 0) || (robot.getDirection() == DOWN && axisDiffX < 0)) {
            robot.turnRight();
            amountOfSteps(robot, axisDiffX);
            return;
        }

        if ((robot.getDirection() == UP && axisDiffX < 0) || (robot.getDirection() == DOWN && axisDiffX > 0)) {
            robot.turnLeft();
            amountOfSteps(robot, axisDiffX);
            return;
        }

        if ((robot.getDirection() == RIGHT && axisDiffX > 0) || (robot.getDirection() == LEFT && axisDiffX < 0)){
            amountOfSteps(robot, axisDiffX);
            return;
        }

        if ((robot.getDirection() == RIGHT && axisDiffX < 0) || (robot.getDirection() == LEFT && axisDiffX > 0)) {
            robot.turnRight();
            robot.turnRight();
            amountOfSteps(robot, axisDiffX);
            return;
        }

    }

    private void movingByAxisY(Robot robot, int axisDiffY) {

        if ((robot.getDirection() == UP && axisDiffY > 0) || (robot.getDirection() == DOWN && axisDiffY < 0)) {
            amountOfSteps(robot, axisDiffY);
            return;
        }

        if ((robot.getDirection() == UP && axisDiffY < 0) || (robot.getDirection() == DOWN && axisDiffY > 0)) {
            robot.turnRight();
            robot.turnRight();
            amountOfSteps(robot, axisDiffY);
            return;
        }

        if ((robot.getDirection() == RIGHT && axisDiffY > 0) || (robot.getDirection() == LEFT && axisDiffY < 0)){
            robot.turnLeft();
            amountOfSteps(robot, axisDiffY);
            return;
        }

        if ((robot.getDirection() == RIGHT && axisDiffY < 0) || (robot.getDirection() == LEFT && axisDiffY > 0)) {
            robot.turnRight();
            amountOfSteps(robot, axisDiffY);
            return;
        }
    }

    private void amountOfSteps(Robot robot, int steps){
        for (int i = 0; i < Math.abs(steps); i++) {
            robot.stepForward();
        }
    }


}
