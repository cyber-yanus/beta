package gameObjects.gameActors;

import handler.MoveDirections;

import java.awt.*;

public abstract class Actor {

    protected int heals = 100;
    protected int speed = 2;
    protected Point directionPoint;

    protected String name = "";

    Actor(String name, int heals, int speed)
    {
        this.name = name;
        this.heals = heals;
        this.speed = speed;
    }

    public void fire() {}

    public void move(MoveDirections moveDirections) {}

    public Point getDirectionPoint()
    {
        return directionPoint;
    }
}
