package handler.commands;

import gameObjects.Actor;
import handler.Command;
import handler.MoveDirections;

public class LeftMoveCommand implements Command
{
    private MoveDirections moveDirections = MoveDirections.LEFT;

    @Override
    public void execute(Actor gameActor)
    {
        gameActor.move(moveDirections);
    }
}
