package model;

public class Robot {
    private Direction direction;
    private int x;
    private int y;

    public Robot() {
    }

    public Robot(Direction direction, int x, int y) {
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        if (this.direction == Direction.DOWN){
            this.direction = Direction.RIGHT;
        } else if (direction == Direction.UP){
            this.direction = Direction.LEFT;
        } else if (direction == Direction.LEFT){
            this.direction = Direction.DOWN;
        } else if (direction == Direction.RIGHT){
            this.direction = Direction.UP;
        }
    }

    public void turnRight() {
        if (this.direction == Direction.DOWN){
            this.direction = Direction.LEFT;
        } else if (this.direction == Direction.UP){
            this.direction = Direction.RIGHT;
        } else if (this.direction == Direction.LEFT){
            this.direction = Direction.UP;
        } else if (this.direction == Direction.RIGHT){
            this.direction = Direction.DOWN;
        }
    }

    public void stepForward() {
        if (direction == Direction.DOWN){
            this.y--;
        } else if (direction == Direction.UP){
            this.y++;
        } else if (direction == Direction.LEFT){
            this.x--;
        } else if (direction == Direction.RIGHT){
            this.x++;
        }
    }
}
