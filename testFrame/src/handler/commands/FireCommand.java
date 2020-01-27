package handler.commands;

import gameObjects.Actor;
import handler.Command;

public class FireCommand implements Command
{
    @Override
    public void execute(Actor gameActor)
    {
        gameActor.fire();
    }
}
