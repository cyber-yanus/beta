package handler;

import gameObjects.mainPers.GameActor;

public interface Command {
    void execute(GameActor gameActor);
}
