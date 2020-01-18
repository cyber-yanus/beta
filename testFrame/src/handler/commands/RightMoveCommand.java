package handler.commands;

import gameObjects.gameActors.GameActor;
import handler.Command;
import handler.MoveDirections;

public class RightMoveCommand implements Command
{
    private MoveDirections moveDirections = MoveDirections.RIGHT;

    @Override
    public void execute(GameActor gameActor)
    {
        gameActor.move(moveDirections);
    }

}
