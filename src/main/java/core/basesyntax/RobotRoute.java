package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int differenceX = Math.abs(toX - robot.getX());
        int differenceY = Math.abs(toY - robot.getY());

        if (toX < robot.getX()) { // expectedX < startX
            if (robot.getDirection() == Direction.LEFT) { // expectedX < startX; direction = YES
                for (int i = 0; i < differenceX; i++) {
                    robot.stepForward();
                }
                if (toY < robot.getY()) { // expectedX < startX; expectedY < startY; direction = YES
                    robot.turnLeft();
                    for (int i = 0; i < differenceY; i++) {
                        robot.stepForward();
                    }
                } else { // expectedX < startX; expectedY > startY; direction = YES
                    robot.turnRight();
                    for (int i = 0; i < differenceY; i++) {
                        robot.stepForward();
                    }
                }
            } else { // expectedX < startX; direction = NO
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnRight();
                }
                for (int i = 0; i < differenceX; i++) {
                    robot.stepForward();
                }
                if (toY < robot.getY()) { // expectedX < startX; expectedY < startY;direction = NO
                    robot.turnLeft();
                    for (int i = 0; i < differenceY; i++) {
                        robot.stepForward();
                    }
                } else { // expectedX < startX; expectedY > startY; direction = NO
                    robot.turnRight();
                    for (int i = 0; i < differenceY; i++) {
                        robot.stepForward();
                    }
                }
            }
        } else { // expectedX > startX
            if (robot.getDirection() == Direction.RIGHT) { // expectedX > startX; direction = YES
                for (int i = 0; i < differenceX; i++) {
                    robot.stepForward();
                }
                if (toY > robot.getY()) { // expectedX > startX; expectedY > startY; direction = YES
                    robot.turnLeft();
                    for (int i = 0; i < differenceY; i++) {
                        robot.stepForward();
                    }
                } else { // expectedX > startX; expectedY < startY; direction = YES
                    robot.turnRight();
                    for (int i = 0; i < differenceY; i++) {
                        robot.stepForward();
                    }
                }
            } else { // expectedX > startX; direction = NO
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                for (int i = 0; i < differenceX; i++) {
                    robot.stepForward();
                }
                if (toY < robot.getY()) { // expectedX > startX; expectedY < startY; direction = NO
                    robot.turnRight();
                    for (int i = 0; i < differenceY; i++) {
                        robot.stepForward();
                    }
                } else { // expectedX > startX; expectedY > startY; direction = NO
                    robot.turnLeft();
                    for (int i = 0; i < differenceY; i++) {
                        robot.stepForward();
                    }
                }
            }

        }

    }
}
