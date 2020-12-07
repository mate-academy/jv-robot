# jv-robot
We have our good friend Robot Johny who got lost on the playground. His position is represented by two integer 
coordinates: `X` and `Y`. X is the horizontal axis and Y-axis is vertical.(Remember how you drew them in school?). 
Unfortunately he has some unknown random initial position and we don't even know initial direction.
But he really wants to go home, which is represented by `toX` and `toY`.  
Hopefully you can figure something out.

You can use the following Robots' methods:

public class Robot {

    public Direction getDirection() {
        // current robot direction
    }

    public int getX() {
        // current X position
    }

    public int getY() {
        // current Y positon
    }

    public void turnLeft() {
        // turn the robot left for 90 degrees
    }

    public void turnRight() {
        // turn the robot right for 90 degrees
    }

    public void stepForward() {
        // one step in the current direction
        // for each step robot changes X or Y position to one unit
    }
}

Direction shows where robot is pointed to, (this is `enum`):
``` 
public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}
```
Method flow example:   

We pass into method: toX == 3, toY == 0; robots' initial state: robot.getX() == 0, robot.getY() == 0, robot.getDirection() == Direction.UP

To move the robot to given point (3, 0), methods should call this method sequence:

robot.turnRight();
robot.stepForward();
robot.stepForward();
robot.stepForward();

[Try to avoid these mistakes while solving task](https://mate-academy.github.io/jv-program-common-mistakes/java-core/oop/robot/robot-route)
