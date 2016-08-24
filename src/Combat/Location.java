package Combat;

/**
 * Created by mathcoder23 on 8/22/16.
 */
public class Location {
    public int X = 0;
    public int y = 0;

    public Location(){}
    public Location(int x, int y) {
        X = x;
        this.y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
