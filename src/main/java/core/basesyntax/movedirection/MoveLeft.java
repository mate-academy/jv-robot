package core.basesyntax.movedirection;

import core.basesyntax.Robot;

public class MoveLeft {
    public void moveLeft(Robot robot) {
        switch (robot.getDirection()) {
            case DOWN:
                robot.turnLeft();
                robot.turnLeft();
                robot.turnLeft();
                break;
            case RIGHT:
                robot.turnLeft();
                robot.turnLeft();
                break;
            case UP:
                robot.turnLeft();
                break;
            case LEFT:
            default:
                break;
        }
    }
}
