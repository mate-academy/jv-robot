package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getY() > toY) {
            if (robot.getDirection() == Direction.UP) { //DOWN turn
                robot.turnRight();
                robot.turnRight();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getY() > toY) {
                robot.stepForward();
            }

        } else if (robot.getY() < toY) {
            if (robot.getDirection() == Direction.RIGHT) { //UP turn
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
                robot.turnRight();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnRight();
            }
            while (robot.getY() < toY) {
                robot.stepForward();
            }
        }

        if (robot.getX() > toX) {
            if (robot.getDirection() == Direction.UP) { //LEFT turn
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnLeft();
            } else if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
                robot.turnRight();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }

        } else if (robot.getX() < toX) {
            if (robot.getDirection() == Direction.UP) { //RIGHT turn
                robot.turnRight();
            } else if (robot.getDirection() == Direction.DOWN) {
                robot.turnRight();
            } else if (robot.getDirection() == Direction.LEFT) {
                robot.turnLeft();
                robot.turnLeft();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }

        }
    }
}
        // якщо дивиться UP, а треба рухатись LEFT, то він робить 1 поворот robot.turnLeft()
//якщо дивиться RIGHT, а треба рухатись LEFT, то він робить 2 поворот robot.turnLeft()
//якщо дивиться DOWN, а треба рухатись LEFT, то він робить 1 поворот robot.turnRight()

//якщо дивиться UP, а треба рухатись RIGHT, то він робить 1 поворот robot.turnRight()
//якщо дивиться LEFT, а треба рухатись RIGHT, то він робить 2 поворот robot.turnRight()
//якщо дивиться DOWN, а треба рухатись RIGHT, то він робить 1 поворот robot.turnLeft()

//якщо дивиться UP, а треба рухатись DOWN, то він робить 2 поворот robot.turnRight()
//якщо дивиться LEFT, а треба рухатись DOWN, то він робить 1 поворот robot.turnLeft()
//якщо дивиться RIGHT, а треба рухатись DOWN, то він робить 1 поворот robot.turnRight()

//якщо дивиться DOWN, а треба рухатись UP, то він робить 2 поворот robot.turnRight()
//якщо дивиться LEFT, а треба рухатись UP, то він робить 1 поворот robot.turnRight()
//якщо дивиться RIGHT, а треба рухатись UP, то він робить 1 поворот robot.turnLeft()
