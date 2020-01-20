package handler;

import handler.commands.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;


public class InputHandler {

    private Command LMB = new FireCommand();
    private Command button_A = new LeftMoveCommand();
    private Command button_W = new UpMoveCommand();
    private Command button_D = new RightMoveCommand();
    private Command button_S = new DownMoveCommand();


    public InputHandler()
    {}

    public Command handleInput(KeyEvent keyEvent)
    {
        switch (keyEvent.getCode())
        {
            case W: return button_W;
            case A: return button_A;
            case S: return button_S;
            case D: return button_D;
        }
        return null;
    }

    public Command handleInput(MouseEvent mouseEvent)
    {
        switch (mouseEvent.getButton())
        {
            case PRIMARY: return LMB;
        }
        return null;
    }


}
