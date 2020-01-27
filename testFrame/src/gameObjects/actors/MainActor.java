package gameObjects.actors;

import gameObjects.Actor;
import handler.MoveDirections;
import observer.GameEvent;
import observer.GameObserver;

import java.util.ArrayList;
import java.util.List;


public class MainActor extends Actor {

    private List<GameObserver> observerList = new ArrayList<>();

    public MainActor(int lineOnMap, int columnOnMap, int heals, int speed)
    {
        super(lineOnMap, columnOnMap, heals, speed);
    }

    @Override
    public void fire() {
        System.out.println("Fire");
    }

    @Override
    public void move(MoveDirections direction)
    {
        //смена координат на матрице

        notifyAllObservers(GameEvent.MOVE_MAIN_ACTOR);

        //запуск спрайта
    }

    public void addObserver(GameObserver gameObserver)
    {
        observerList.add(gameObserver);
    }

    public void removeObserver(GameObserver gameObserver)
    {
        observerList.remove(gameObserver);
    }

    private void notifyAllObservers(GameEvent event)
    {
        for (GameObserver gameObserver : observerList)
            gameObserver.onNotify(event, this);
    }

}
