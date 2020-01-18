package handler;

import gameObjects.gameActors.GameActor;

public interface Command
{
    void execute(GameActor gameActor);
}
