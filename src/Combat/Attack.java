package Combat;

import static Combat.Direction.*;

/**
 * Created by mathcoder23 on 8/22/16.
 */
public class Attack {
    private int ownerId;
    private Direction direction = DOWN;
    private int scope=1;
    private int strong = 10;
    private Location motionLocation;

    public Attack(int ownerId, Direction direction, int scope, int strong, Location motionLocation) {
        this.ownerId = ownerId;
        this.direction = direction;
        this.scope = scope;
        this.strong = strong;
        this.motionLocation = motionLocation;
    }

    public boolean isEffective(Location loc)
    {
        switch (getDirection())
        {
            case DOWN:

                if(loc.getX() == motionLocation.getX() && loc.getY()<= motionLocation.getY()+scope)
                    return true;
                break;
            case UP:
                if(loc.getX() == motionLocation.getX() && loc.getY()>= motionLocation.getY()-scope)
                    return true;
                break;
            case LEFT:

                if(loc.getY() == motionLocation.getY() && loc.getX()>=motionLocation.getX()-scope)
                    return true;
                break;

            case RIGHT:

                if(loc.getY() == motionLocation.getY() && loc.getX()<=motionLocation.getX()-scope)
                    return true;
                break;
        }

return false;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public Location getMotionLocation() {
        return motionLocation;
    }

    public void setMotionLocation(Location motionLocation) {
        this.motionLocation = motionLocation;
    }


}
