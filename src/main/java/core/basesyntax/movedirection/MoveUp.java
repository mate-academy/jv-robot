package core.basesyntax.movedirection;

import core.basesyntax.Robot;

public class MoveUp {
    public void moveUp(Robot robot) {
        switch (robot.getDirection()) {
            case LEFT:
                robot.turnLeft();
                robot.turnLeft();
                robot.turnLeft();
                break;
            case DOWN:
                robot.turnLeft();
                robot.turnLeft();
                break;
            case RIGHT:
                robot.turnLeft();
                break;
            case UP:
            default:
                break;
        }
    }
}
