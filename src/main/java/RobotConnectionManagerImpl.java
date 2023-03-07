class RobotConnectionManagerImpl implements RobotConnectionManager {
    private int repeats = 1;
    private int connectOnAttemptNumber;

    public RobotConnectionManagerImpl(int connectOnAttemptNumber) {
        this.connectOnAttemptNumber = connectOnAttemptNumber;
    }

    @Override
    public RobotConnection getConnection() {
        if (this.repeats < connectOnAttemptNumber) {
            repeats++;
            throw new RobotConnectionException("Failed to connect");
        }
        return new RobotConnectionImpl();
    }
}