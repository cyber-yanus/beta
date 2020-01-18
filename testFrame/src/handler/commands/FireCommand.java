package handler.commands;

import gameObjects.gameActors.GameActor;
import handler.Command;

public class FireCommand implements Command
{

    @Override
    public void execute(GameActor gameActor)
    {
        gameActor.fire();
    }
}
