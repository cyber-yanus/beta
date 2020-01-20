
import gameObjects.gameActors.Actor;

import handler.Command;
import handler.InputHandler;

import levels.QueueLevels;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class MainScene extends Application
{
    private Pane mainRoot = new Pane();

    private QueueLevels queueLevels = new QueueLevels();

    private InputHandler inputHandler = new InputHandler();

    private GameLoop gameLoop = new GameLoop(this);

    @Override
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(mainRoot, 300, 275);

        loadNewLevel();

        input(scene);

        gameLoop.start();

        primaryStage.setTitle("beta");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private void loadNewLevel()
    {
        if (queueLevels.getPresentLevel() != null)
            mainRoot.getChildren().removeAll(queueLevels.getPresentLevel().getTiles());

        queueLevels.startNextLevel();

        mainRoot.getChildren().addAll(queueLevels.getPresentLevel().getTiles());
    }

    public void loadUpdateMap()
    {
        mainRoot.getChildren().addAll(queueLevels.getPresentLevel().updateMap());
    }

    private void input(Scene scene)
    {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                Command command = inputHandler.handleInput(keyEvent);
                if (command != null) {
                    Actor actor = queueLevels.getPresentLevel().getMainActor();
                    command.execute(actor);
                }
            }
        });

        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Command command = inputHandler.handleInput(mouseEvent);
                if (command != null) {
                    Actor actor = queueLevels.getPresentLevel().getMainActor();
                    command.execute(actor);
                }
            }
        });

    }


}

