package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
      //write your solution here
        int posx = robot.getX();
        int posy = robot.getY();
        Direction dir = robot.getDirection();
        if (posx == toX && posy == toY) {
            return;
        }
        if (posy > toY) {
            if (dir == Direction.UP) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (dir == Direction.LEFT) {
                robot.turnLeft();
            } else if (dir == Direction.RIGHT) {
                robot.turnRight();
            }
        } else if (posy < toY) {
            if (dir == Direction.DOWN) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (dir == Direction.LEFT) {
                robot.turnRight();
            } else if (dir == Direction.RIGHT) {
                robot.turnLeft();
            }
        }
        while (posy != toY) {
            robot.stepForward();
            posy = robot.getY();
        }
        dir = robot.getDirection();
        if (posx > toX) {
            if (dir == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (dir == Direction.UP) {
                robot.turnLeft();
            } else if (dir == Direction.DOWN) {
                robot.turnRight();
            }
        } else if (posx < toX) {
            if (dir == Direction.LEFT) {
                robot.turnLeft();
                robot.turnLeft();
            } else if (dir == Direction.UP) {
                robot.turnRight();
            } else if (dir == Direction.DOWN) {
                robot.turnLeft();
            }
        }
        while (posx != toX) {
            robot.stepForward();
            posx = robot.getX();
        }
    }
}
