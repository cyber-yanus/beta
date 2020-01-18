package handler.commands;

import gameObjects.gameActors.GameActor;
import handler.Command;
import handler.MoveDirections;

public class LeftMoveCommand implements Command
{
    private MoveDirections moveDirections = MoveDirections.LEFT;

    @Override
    public void execute(GameActor gameActor)
    {
        gameActor.move(moveDirections);
    }
}
