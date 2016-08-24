package Combat;

import java.util.Random;

/**
 * Created by mathcoder23 on 8/19/16.
 */
public abstract class Hero {
    protected int id;
    protected String name;
    private int blood = 100;
    private int scope =5;
    private int strong = 10;
    private int speed = 1;

    private Location location;
    private Direction dir = Direction.DOWN;
    private CodingCombat combat;

    protected Shoes shoes = new Shoes();
    protected Weapon weapon = new Weapon();

    public abstract void loop();
    public abstract void setUp();

    public Hero(int id, String name) {
        Random random = new Random();
        this.id = id;
        this.name = name;
        this.combat = CodingCombat.getInstance();
        this.location = new Location(random.nextInt(100),random.nextInt(100));
    }

    public void attack()
    {
        Attack att = new Attack(this.id,this.dir,this.scope,this.strong,this.location);
        combat.getAttacks().add(att);

    }

    public void moveUp(){
        location.setY(location.getY()-speed);
        dir = Direction.UP;
        System.out.println("up");
    }
    public void moveLeft(){
        location.setX(location.getX()-speed);
        dir = Direction.LEFT;
        System.out.println("moveLeft");

    }
    public void moveRight(){
        location.setX(location.getX()+speed);
        dir = Direction.RIGHT;
        System.out.println("moveRight");

    }
    public void moveDown(){
        location.setY(location.getY()+speed);
        dir = Direction.DOWN;
        System.out.println("moveDown");

    }

    public String getName() {
        return name;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
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

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public CodingCombat getCombat() {
        return combat;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", blood=" + blood +
                ", x:" + location.getX() +
                ", y:" + location.getY() +
                ", dir=" + dir +
                '}';
    }
}
