package handler;

import gameObjects.Actor;

public interface Command
{
    void execute(Actor actor);
}
