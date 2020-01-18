package handler.commands;

import gameObjects.gameActors.GameActor;
import handler.Command;
import handler.MoveDirections;

public class UpMoveCommand implements Command
{
    private MoveDirections moveDirections = MoveDirections.UP;

    @Override
    public void execute(GameActor gameActor)
    {
        gameActor.move(moveDirections);
    }
}
