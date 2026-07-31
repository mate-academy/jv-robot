package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        // write your solution here
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                turnToShortest(robot, Direction.RIGHT);
            } else {
                turnToShortest(robot, Direction.LEFT);
            }
            robot.stepForward();
        }

        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                turnToShortest(robot, Direction.UP);
            } else {
                turnToShortest(robot, Direction.DOWN);
            }
            robot.stepForward();
        }
    }

    private void turnToShortest(Robot robot, Direction target) {
        int right = rightTurns(robot.getDirection(), target);
        int left = leftTurns(robot.getDirection(), target);

        if (right <= left) {
            for (int i = 0; i < right; i++) {
                robot.turnRight();
            }
        } else {
            for (int i = 0; i < left; i++) {
                robot.turnLeft();
            }
        }
    }

    private int rightTurns(Direction from, Direction to) {
        return (convertDirectionIntoANumber(to)
                - convertDirectionIntoANumber(from) + 4) % 4;
    }

    private int leftTurns(Direction from, Direction to) {
        return (convertDirectionIntoANumber(from)
                - convertDirectionIntoANumber(to) + 4) % 4;
    }

    private int convertDirectionIntoANumber(Direction direction) {
        return switch (direction) {
            case UP -> 0;
            case RIGHT -> 1;
            case DOWN -> 2;
            case LEFT -> 3;
        };
    }
}
