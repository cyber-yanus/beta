package gameObjects.mainPers;

public class Pers extends GameActor {
    
    public Pers(String urlImage, String name, int heals, int speed)
    {
        super(urlImage, name, heals, speed);
    }

    public Pers()
    {}

    public void fire()
    {
        System.out.println("fire");
    }


    public void move(String direction)
    {
        System.out.println("move " + direction);
    }



}
