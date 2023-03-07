public class RobotConnectionImpl implements RobotConnection {
    @Override
    public void moveRobotTo(int x, int y) {
        System.out.println("Robot was successfully moved");
    }

    @Override
    public void close() {
        System.out.println("Closing");
    }
}