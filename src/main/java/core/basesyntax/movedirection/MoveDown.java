package core.basesyntax.movedirection;

import core.basesyntax.Robot;

public class MoveDown {
    public void moveDown(Robot robot) {
        switch (robot.getDirection()) {
            case RIGHT:
                robot.turnLeft();
                robot.turnLeft();
                robot.turnLeft();
                break;
            case UP:
                robot.turnLeft();
                robot.turnLeft();
                break;
            case LEFT:
                robot.turnLeft();
                break;
            case DOWN:
            default:
                break;
        }
    }
}
