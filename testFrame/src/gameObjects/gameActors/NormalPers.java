package gameObjects.gameActors;

import handler.MoveDirections;

public class NormalPers extends GameActor
{
    public NormalPers(String urlImage, String name, int heals, int speed)
    {
        super(urlImage, name, heals, speed);
    }

    public NormalPers()
    {}

    @Override
    public void fire() {
        System.out.println("Fire");
    }

    @Override
    public void move(MoveDirections direction) {
        System.out.println("Move " + direction.getDirection());
    }
}
