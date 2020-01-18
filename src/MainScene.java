import environment.MapController;

import gameObjects.gameActors.GameActor;
import gameObjects.gameActors.PresentMainPers;

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
    private Pane root = new Pane();

    private QueueLevels queueLevels = new QueueLevels();

    private InputHandler inputHandler = new InputHandler();


    @Override
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(root, 300, 275);

        loadNewLevel();

        input(scene);

        primaryStage.setTitle("beta");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void loadNewLevel()
    {
        if(queueLevels.getNowLevel() != null)
            root.getChildren().removeAll(MapController.getInstance().loadGameMap(queueLevels.getNowGameMap()));

        queueLevels.startNextLevel();
        root.getChildren().addAll(MapController.getInstance().loadGameMap(queueLevels.getNowGameMap()));

    }

    private void input(Scene scene)
    {

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                Command command = inputHandler.handleInput(keyEvent);
                if(command != null)
                {
                    GameActor gameActor = PresentMainPers.getInstance().getPresentPers();
                    command.execute(gameActor);
                }
            }
        });

        scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Command command = inputHandler.handleInput(mouseEvent);
                if(command != null)
                {
                    GameActor gameActor = PresentMainPers.getInstance().getPresentPers();
                    command.execute(gameActor);
                }
            }
        });

    }


}

