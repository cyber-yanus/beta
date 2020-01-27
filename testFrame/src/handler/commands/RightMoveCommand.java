package handler.commands;

import gameObjects.Actor;
import handler.Command;
import handler.MoveDirections;

public class RightMoveCommand implements Command
{
    private MoveDirections moveDirections = MoveDirections.RIGHT;

    @Override
    public void execute(Actor gameActor)
    {
        gameActor.move(moveDirections);
    }
}
