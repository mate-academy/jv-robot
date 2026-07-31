package core.basesyntax;

public class Point {
    private final int coordinateX;
    private final int coordinatey;

    public Point(int x, int y) {
        this.coordinateX = x;
        this.coordinatey = y;
    }

    @Override
    public boolean equals(Object anotherPosition) {
        if (anotherPosition.getClass() != this.getClass()) {
            return false;
        }
        return ((Point)anotherPosition).coordinateX == coordinateX
                && ((Point)anotherPosition).coordinatey == coordinatey;
    }

    public int getX() {
        return coordinateX;
    }

    public int getY() {
        return coordinatey;
    }
}
