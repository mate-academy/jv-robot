package core.basesyntax.movedirection;

import core.basesyntax.Robot;

public class MoveRight {
    public void moveRight(Robot robot) {
        switch (robot.getDirection()) {
            case UP:
                robot.turnLeft();
                robot.turnLeft();
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnLeft();
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnLeft();
                break;
            case RIGHT:
            default:
                break;
        }
    }
}
