package handler.commands;

import gameObjects.Actor;
import handler.Command;
import handler.MoveDirections;

public class DownMoveCommand implements Command
{
    private MoveDirections moveDirections = MoveDirections.DOWN;

    @Override
    public void execute(Actor actor) {
        actor.move(moveDirections);
    }
}
