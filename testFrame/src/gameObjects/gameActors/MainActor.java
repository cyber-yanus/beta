package gameObjects.gameActors;

import handler.MoveDirections;

import java.awt.*;

public class MainActor extends Actor {
    int lineOnMap = 0;
    int columnOnMap = 0;

    public MainActor(String name, int heals, int speed) {
        super(name, heals, speed);
    }

    @Override
    public void fire() {
        System.out.println("Fire");
    }

    @Override
    public void move(MoveDirections direction) {
        Point dir = direction.getDirection();

        System.out.println("Move " + direction.getDirection());

        //запуск спрайта

        lineOnMap = dir.x;
        columnOnMap = dir.y;
    }

    @Override
    public Point getDirectionPoint() {
        directionPoint = new Point(columnOnMap, lineOnMap);

        columnOnMap = 0;
        lineOnMap = 0;

        return directionPoint;
    }
}
