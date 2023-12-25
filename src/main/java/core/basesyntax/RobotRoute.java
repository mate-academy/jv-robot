package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX) {
            if (robot.getX() < toX) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            } else if (robot.getX() > toX) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }
            robot.stepForward();
        }
        while (robot.getY() != toY) {
            if (robot.getY() < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            } else if (robot.getY() > toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
            }
            robot.stepForward();
        }
    }
}




// ЧОМУ ЦЕ НЕ ПРАЦЮЄ?
//        if (toX - robot.getX() > 0) {
//            while (robot.getDirection() != Direction.RIGHT) {
//                robot.turnRight();
//            }
//        }
//        if (toX - robot.getX() < 0) {
//            while (robot.getDirection() != Direction.LEFT) {
//                robot.turnLeft();
//            }
//            while (toX - robot.getX() != 0) {
//                robot.stepForward();
//            }
//            if (toY - robot.getY() > 0) {
//                while (robot.getDirection() != Direction.UP) {
//                    robot.turnRight();
//                }
//            }
//            if (toY - robot.getY() < 0) {
//                while (robot.getDirection() != Direction.DOWN) {
//                    robot.turnLeft();
//                }
//            }
//            while (toY - robot.getY() != 0) {
//                robot.stepForward();
//            }
//        }
//    }






