package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        //write your solution here
    }

    public int getDistance(int positionCoordinate, int toCoordinate) {
        if (positionCoordinate < 0 ^ toCoordinate < 0) {
            return Math.abs(positionCoordinate) + Math.abs(toCoordinate);
        }
        return toCoordinate - positionCoordinate;
    }
}
