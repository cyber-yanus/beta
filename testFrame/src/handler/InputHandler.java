package handler;

import gameObjects.mainPers.GameActor;
import gameObjects.mainPers.Pers;

public class InputHandler {

    private Pers pers = new Pers();

    private Command LMB = new FireCommand();
    private Command buttonMove = new MoveCommand();

    public InputHandler(GameActor gameActor)
    {

    }


    public void settingsHandler()
    {


    }


    public void handleInput()
    {
        if(true) buttonMove.execute(pers);
    }


}
