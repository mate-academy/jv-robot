package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
        //horizontal move
        if (robot.getX() > toX) { //Set direction for X
            while (robot.getDirection() != Direction.LEFT) { //Turn to Left direction
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) { //Turn to Right direction
                robot.turnLeft();
            }
        }
        while (robot.getX() != toX) { //move step by step to final X position
            robot.stepForward();
        }

        //Vertical move Y
        if (robot.getY() > toY) { //Set direction for Y
            while (robot.getDirection() != Direction.DOWN) { //Turn to Left direction
                robot.turnLeft();
            }
        } else {
            while (robot.getDirection() != Direction.UP) { //Turn to Right direction
                robot.turnLeft();
            }
        }
        while (robot.getY() != toY) { //move step by step to final X position
            robot.stepForward();
        }
    }
}

