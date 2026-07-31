package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() == toX && robot.getY() == toY) { //if stay at the home pos
            return;
        }
        if (robot.getX() > toX) { //if stay rightside from home pos
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
            }
        } else { //if stay leftside from home pos
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnRight();
            }
        }
        while (robot.getX() != toX) { //going at X axis to home pos
            robot.stepForward();
        }
        if (robot.getY() > toY) { //if stay upper home pos
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
            }
        } else { //if stay downside from home pos
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnRight();
            }
        }
        while (robot.getY() != toY) { //going at Y axis to home pos
            robot.stepForward();
        }
        System.out.println("Congratulations! You get home =)");
    }
}
