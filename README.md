# jv-robot

---
### Task Requirement

We have our good friend Robot Johny who got lost on the playground. His position is represented by two integer coordinates: `X` and `Y`. X is the horizontal axis and Y is the vertical axis. Unfortunately, he has some unknown random initial position and we don't even know the initial Direction in which he is facing. But he really wants to go home, which is represented by `toX` and `toY`. 

Your task is to help Johny find his way home by implementing logic in the `RobotRoute` class that navigates the robot from its current position to the target position.

### Provided Classes

#### Direction Enum
An enum named `Direction` is provided which has the following values: UP, DOWN, LEFT, and RIGHT.

#### Robot Class
The `Robot` class is provided with the following methods:
- `getDirection()`: returns the current direction of the robot.
- `getX()` and `getY()`: return the current X and Y coordinates of the robot respectively.
- `turnLeft()` and `turnRight()`: change the direction of the robot to the left or right respectively.d
- `stepForward()`: moves the robot one step forward in its current direction.

#### RobotRoute Class
The `RobotRoute` class is provided with a method signature:
- `moveRobot(Robot robot, int toX, int toY)`: This method should take a `Robot` instance and two integer parameters `toX` and `toY`, which represent the target position. The method should navigate the robot from its current position to the target position, considering its current direction and updating its direction as needed.

### Requirements
- Implement the logic in the `moveRobot` method of the `RobotRoute` class to navigate the robot from its current position to the target position (`toX`, `toY`).
- The robot should be able to navigate through all four quadrants of the coordinate plane.
- The robot should be able to handle moving from any quadrant to any other quadrant, as well as staying in the same position.
- The robot's position and direction should be updated appropriately after the `moveRobot` method is called.

### Notes
- Pay attention to the robot's direction and ensure it is updated appropriately as it moves towards the target position.
- [Try to avoid these mistakes while solving task](./checklist.md)
