package Combat;

/**
 * Created by mathcoder23 on 8/19/16.
 */
public class Shoes {
    private Location location;
    private Direction dir;
    private int speed=1;
    public void moveUp(){
        location.setY(location.getY()+speed);
        dir = Direction.UP;
    }
    public void moveLeft(){
        location.setX(location.getX()-speed);
        dir = Direction.LEFT;
    }
    public void moveRight(){
        location.setX(location.getX()+speed);
        dir = Direction.RIGHT;
    }
    public void moveDown(){
        location.setY(location.getY()-speed);
        dir = Direction.DOWN;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Direction getDir() {
        return dir;
    }

    public void setDir(Direction dir) {
        this.dir = dir;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
