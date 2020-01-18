package handler.commands;

import gameObjects.gameActors.GameActor;
import handler.Command;
import handler.MoveDirections;

public class DownMoveCommand implements Command
{
    private MoveDirections moveDirections = MoveDirections.DOWN;

    @Override
    public void execute(GameActor gameActor) {
        gameActor.move(moveDirections);
    }
}
