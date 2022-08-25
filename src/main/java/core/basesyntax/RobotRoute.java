package core.basesyntax;

public class RobotRoute {

    private void checkX(Robot robot, int x) {
        Direction direction;
        if (x < robot.getX()) {
            switch (robot.getDirection()) {
                case UP: System.out.println(robot.turnLeft());break;
                case RIGHT: System.out.println(robot.turnRobot());break;
                case DOWN: System.out.println(robot.turnRight());break;
                case LEFT: System.out.println(direction = Direction.LEFT);break;}}
        else {System.out.println("Coordinates 0");
            if (x > robot.getX()) {
                switch (robot.getDirection()) {
                    case UP: System.out.println(robot.turnRight());break;
                    case RIGHT: System.out.println(direction = Direction.RIGHT);break;
                    case DOWN: System.out.println(robot.turnLeft());break;
                    case LEFT: System.out.println(robot.turnRobot());break;}}
            else {System.out.println("Coordinates 0");}}}

    private void checkY(Robot robot , int y){
        Direction direction ;
        if(y < robot.getY()){
            switch (robot.getDirection()){
                case UP :   System.out.println(robot.turnRobot());break;
                case RIGHT: System.out.println(robot.turnRight());break;
                case LEFT:  System.out.println(robot.turnLeft());break;
                case DOWN:  System.out.println(direction = Direction.DOWN);break;
            }
        }else {System.out.println("Coordinates 0");}
        if(y > robot.getY()) {
            switch (robot.getDirection()) {
                case UP: System.out.println(direction = Direction.UP);break;
                case DOWN: System.out.println(robot.turnRobot());break;
                case LEFT: System.out.println(robot.turnRight());break;
                case RIGHT: System.out.println(robot.turnLeft());break;
            }} else {System.out.println("Coordinates 0");}}

    public void movingAroundMap(Robot robot, int toX, int toY) {
        int x = toX + (robot.getX() * -1);
        int y = toY + (robot.getY() * -1);
        int xMotor = 0;
        if (x < 0) {xMotor = -1 * x;} else {xMotor = x;}
        int yMotor = 0;
        if (y < 0) {yMotor = -1 * y;} else {yMotor = y;}
        checkX(robot,toX);
        for (int iX = 0; iX < xMotor; iX++) {
            System.out.println(new StringBuilder().append("Step ").append(robot.stepForward()).append(" Robot ==> ").append(iX + 1).append(" X ").append("coordinates").append("(").append(robot.getX()).append(",").append(robot.getY()).append(")").toString());
        }
        checkY(robot,toY);
        for (int iY = 0; iY < yMotor; iY++) {
            System.out.println(new StringBuilder().append("Step ").append(robot.stepForward()).append(" Robot ==> ").append(iY + 1).append(" Y ").append("coordinates").append("(").append(robot.getX()).append(",").append(robot.getY()).append(")").toString());
        }}


    public void moveRobot(Robot robot, int toX, int toY) {
        movingAroundMap(robot, toX, toY);
    }
}
