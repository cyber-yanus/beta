package gameObjects;

import handler.MoveDirections;


public abstract class Actor extends GameObject {

    protected int heals = 100;
    protected int speed = 2;

    protected Actor(int lineOnMap, int columnOnMap, int heals, int speed)
    {
        super(lineOnMap, columnOnMap);

        this.heals = heals;
        this.speed = speed;
    }

    public void move(){}

    public void fire(){}

    public void move(MoveDirections moveDirections){}

}
