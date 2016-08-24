package Combat;

import HeroImpl.Alien;
import HeroImpl.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by mathcoder23 on 8/19/16.
 */
public class CodingCombat {

    public static void main(String[] args)
    {
        try {
            CodingCombat.getInstance().start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private static CodingCombat instance;
    private CodingCombat(){}
    private List<Attack> attacks;


    private List<Hero> heros;
    public void start() throws InterruptedException {
        initCombat();
        while (true)
        {
            for (Hero hero : heros)
            {
                Log(hero.toString());

            }

            for(Attack att:attacks)
            {
                for (Hero hero : heros)
                {
                    if(att.isEffective(hero.getLocation()))
                    {
                        if(hero.getId()!= att.getOwnerId())
                        {
                            hero.setBlood(hero.getBlood()-att.getStrong());

                        }
                        if (hero.getBlood()<=0)
                        {
                            System.out.println(hero.getName()+" has been dide!!!!");
                            System.exit(0);
                        }
                    }

                }

            }

            attacks.clear();

            Thread.sleep(100);
        }
    }
    public void addHero(Hero hero)
    {
        if (null == heros) {
            heros = new ArrayList<>();
        }
        heros.add(hero);
        Log("add hero:" + hero.toString());
    }

    private void initCombat() {
        attacks = new ArrayList<Attack>();

        Hero hero1 = new Alien(1, "alien");
        Hero hero2 = new Easy(2, "easy");
        addHero(hero1);
        addHero(hero2);

        for (final Hero hero : heros)
        {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    Log(hero.getName() + ":i am running");
                    hero.setUp();
                    while (true)
                    {

                        hero.loop();

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
        Log("初始化战场完毕!");
    }
    private void Log(String log)
    {
        System.out.println("combat:"+log);
    }

    public static CodingCombat getInstance() {
        if(null == instance) instance = new CodingCombat();
        return instance;
    }

    public List<Attack> getAttacks() {
        return attacks;
    }


    public List<Hero> getHeros() {
        return heros;
    }

}
