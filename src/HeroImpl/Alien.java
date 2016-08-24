package HeroImpl;

import Combat.Hero;


/**
 * Created by mathcoder23 on 8/19/16.
 */
public class Alien extends Hero {

    public Alien(int id, String name) {

        super(id, name);
    }



    @Override
    public void setUp() {

    }

    @Override
    public void loop() {
        Hero sb = super.getCombat().getHeros().get(1);
//        System.out.println("sb:"+sb.toString());

        if(sb.getLocation().getX() > this.getLocation().getX())
        {
         this.moveRight();
        }
        else if(sb.getLocation().getX() < this.getLocation().getX())
        {
            this.moveLeft();
        }

        if (sb.getLocation().getY() > this.getLocation().getY())
        {
            this.moveDown();
        }
        else if(sb.getLocation().getY() < this.getLocation().getY())
        {
            this.moveUp();
        }

        this.attack();

    }


    @Override
    public String toString() {
        return "        \t\t\tAlien{} " + super.toString();
    }
}
