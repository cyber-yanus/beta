package handler.commands;

import gameObjects.Actor;
import handler.Command;
import handler.MoveDirections;

public class UpMoveCommand implements Command
{
    private MoveDirections moveDirections = MoveDirections.UP;

    @Override
    public void execute(Actor gameActor)
    {
        gameActor.move(moveDirections);
    }
}
