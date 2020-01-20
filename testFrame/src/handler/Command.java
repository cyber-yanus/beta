package handler;

import gameObjects.gameActors.Actor;

public interface Command
{
    void execute(Actor actor);
}
