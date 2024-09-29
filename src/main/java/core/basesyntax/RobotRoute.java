package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //вирішення в разі <<
        if (toX < robot.getX() && toY < robot.getY()){
            while (robot.getDirection() != Direction.LEFT){
                robot.turnLeft();
            }
            while (toX < robot.getX()){
                robot.stepForward();
            }
            while (robot.getDirection() != Direction.DOWN){
                robot.turnLeft();
            }
            while (toY < robot.getY()){
                robot.stepForward();
            }
        }

        //вирішення в разі <>
        if (toX < robot.getX() && toY > robot.getY()){
            while (robot.getDirection() != Direction.LEFT){
                robot.turnLeft();
            }
            while (toX < robot.getX()){
                robot.stepForward();
            }
            while (robot.getDirection() != Direction.UP){
                robot.turnLeft();
            }
            while (toY > robot.getY()){
                robot.stepForward();
            }
        }

        //вирішення в разі <=
        if (toX < robot.getX() && toY < robot.getY()){
            while (robot.getDirection() != Direction.LEFT){
                robot.turnLeft();
            }
            while (toX < robot.getX()){
                robot.stepForward();
            }
            robot.setY(toY);
        }

        //вирішення в разі ><
        if (toX > robot.getX() && toY < robot.getY()){
            while (robot.getDirection() != Direction.RIGHT){
                robot.turnLeft();
            }
            while (toX > robot.getX()){
                robot.stepForward();
            }
            while (robot.getDirection() != Direction.DOWN){
                robot.turnLeft();
            }
            while (toY < robot.getY()){
                robot.stepForward();
            }
        }

        //вирішення в разі >>
        if (toX > robot.getX() && toY > robot.getY()){
            while (robot.getDirection() != Direction.RIGHT){
                robot.turnLeft();
            }
            while (toX > robot.getX()){
                robot.stepForward();
            }
            while (robot.getDirection() != Direction.UP){
                robot.turnLeft();
            }
            while (toY > robot.getY()){
                robot.stepForward();
            }
        }

        //вирішення в разі >=
        if (toX > robot.getX() && toY == robot.getY()){
            while (robot.getDirection() != Direction.RIGHT){
                robot.turnLeft();
            }
            while (toX > robot.getX()){
                robot.stepForward();
            }
            robot.setY(toY);
        }

        //вирішення в разі ==
        if (toX == robot.getX() && toY == robot.getY()){
            robot.setX(toX);
            robot.setY(toY);
        }

        //вирішення в разі =>
        if (toX == robot.getX() && toY > robot.getY()){
            robot.setX(toX);

            while (robot.getDirection() != Direction.DOWN){
                robot.turnLeft();
            }
            while (toY > robot.getY()){
                robot.stepForward();
            }
        }

        //вирішення в разі =<
        if (toX == robot.getX() && toY < robot.getY()){
            robot.setX(toX);

            while (robot.getDirection() != Direction.DOWN){
                robot.turnLeft();
            }
            while (toY < robot.getY()){
                robot.stepForward();
            }
        }
    }
}
