import model.Direction;
import model.Robot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Task_6_2_5Test {

    private Robot robot;

    @Test
    void moveRobotTest() {
        robot = new Robot(Direction.UP,0, 0);
        Task_6_2_5.moveRobot(robot, 3, 0);

        assertEquals(3, robot.getX());
        assertEquals(0, robot.getY());
    }
    @Test
    void moveRobotTest2() {
        robot = new Robot(Direction.UP,0, 0);
        Task_6_2_5.moveRobot(robot, 10, 5);

        assertEquals(10, robot.getX());
        assertEquals(5, robot.getY());
    }

    @Test
    void moveRobotTest3() {
        robot = new Robot(Direction.RIGHT, 3,3);
        Task_6_2_5.moveRobot(robot, 6, 11);

        assertEquals(6, robot.getX());
        assertEquals(11, robot.getY());
    }

    @Test
    void testRobotTurnLeft() {
        robot = new Robot(Direction.DOWN, 6,11);
        robot.turnLeft();
        assertEquals(Direction.RIGHT, robot.getDirection());

        Task_6_2_5.moveRobot(robot, 10, 5);

        assertEquals(10, robot.getX());
        assertEquals(5, robot.getY());

        robot = new Robot(Direction.LEFT, 6,11);
        robot.turnLeft();
        assertEquals(Direction.DOWN, robot.getDirection());

        Task_6_2_5.moveRobot(robot, 11, 6);

        assertEquals(11, robot.getX());
        assertEquals(6, robot.getY());
    }

    @Test
    void moveRobotTest4() {
        robot = new Robot(Direction.UP, 18,2);
        Task_6_2_5.moveRobot(robot, 2, 4);

        assertEquals(2, robot.getX());
        assertEquals(4, robot.getY());

        robot = new Robot(Direction.LEFT, 2,11);
        Task_6_2_5.moveRobot(robot, 14, 5);

        assertEquals(14, robot.getX());
        assertEquals(5, robot.getY());
    }

    @Test
    void testRobotTurnRight() {
        robot = new Robot(Direction.LEFT, 6,11);
        robot.turnRight();
        assertEquals(Direction.UP, robot.getDirection());

        Task_6_2_5.moveRobot(robot, 0, 11);

        assertEquals(0, robot.getX());
        assertEquals(11, robot.getY());

        robot = new Robot(Direction.UP, 6,11);
        robot.turnRight();
        assertEquals(Direction.RIGHT, robot.getDirection());

        Task_6_2_5.moveRobot(robot, 0, 0);

        assertEquals(0, robot.getX());
        assertEquals(0, robot.getY());
    }

    @Test
    void moveRobotTest5() {
        robot = new Robot(Direction.LEFT, 11,11);
        Task_6_2_5.moveRobot(robot, 3, 6);

        assertEquals(3, robot.getX());
        assertEquals(6, robot.getY());

        robot = new Robot(Direction.DOWN, 6,0);
        Task_6_2_5.moveRobot(robot, 15, 4);

        assertEquals(15, robot.getX());
        assertEquals(4, robot.getY());
    }

    @Test
    void testRobotStepForward() {
        robot = new Robot(Direction.UP, 3,3);
        robot.stepForward();
        assertEquals(4, robot.getY());

        Task_6_2_5.moveRobot(robot, 6, 11);
        assertEquals(6, robot.getX());
        assertEquals(11, robot.getY());

        robot = new Robot(Direction.LEFT, 3,3);
        robot.stepForward();
        assertEquals(2, robot.getX());

        Task_6_2_5.moveRobot(robot, 16, 1);

        assertEquals(16, robot.getX());
        assertEquals(1, robot.getY());
    }

    @Test
    void testRobotStepForwardFalseCase() {
        robot = new Robot(Direction.DOWN, 3,3);
        robot.stepForward();
        assertNotEquals(4, robot.getY());

        robot = new Robot(Direction.RIGHT, 3,3);
        robot.stepForward();
        assertNotEquals(2, robot.getX());
    }

}

