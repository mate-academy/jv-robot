package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int x = robot.getX();
        int y = robot.getY();
        // визначаю напрямок
        // роблю напрямок на ліво
        if (x > toX) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();

            }
        }
        // напрямок на право
        if (x < toX) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
                robot.turnRight();
            }
        }
        // переміщаются на ось х
        int stepX = 0;
        if (toX < x) {
            for (int i = toX; i < x; i++) {
                stepX++;
            }
        }
        if (toX > x) {
            for (int i = x; i < toX; i++) {
                stepX++;
            }
        }

        for (int i = 0; i < stepX; i++) {
            robot.stepForward();
        }
        // напрямок вниз
        if (y > toY) {
            if (robot.getDirection() == Direction.UP) {
                robot.turnRight();
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }
        }
        // напрвити вверх
        if (y < toY) {
            if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            }
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
            }
            if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            }

        }

        // переміщаются на ось y
        int stepY = 0;
        if (toY < y) {
            for (int i = toY; i < y; i++) {
                stepY++;
            }
        }
        if (toY > y) {
            for (int i = y; i < toY; i++) {
                stepY++;
            }
        }
        System.out.println(stepY);

        for (int i = 0; i < stepY; i++) {
            robot.stepForward();
        }


        //write your solution here
    }
}
