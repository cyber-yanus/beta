
import gameObjects.Actor;

import gameObjects.GameObject;
import gameObjects.actors.Enemy;
import gameObjects.actors.MainActor;
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

import java.util.ArrayList;
import java.util.List;


public class MainScene extends Application
{
    private Pane mainLayer = new Pane();

    private QueueLevels queueLevels = new QueueLevels();

    private InputHandler inputHandler = new InputHandler();

    private GameLoop gameLoop = new GameLoop(this);

    @Override
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(mainLayer, 300, 275);

        //loadNewLevel();

        //input(scene);

        List<GameObject> gameObjects = new ArrayList<>();

        gameObjects.add(new Enemy(100,1,1,1));
        gameObjects.add(new MainActor(1,1,1,1));


        for (GameObject gameObject : gameObjects)
        {
            if(gameObject.getClass() == MainActor.class)
            {
                System.out.println("enemy");
            }



        }


        gameLoop.start();

        primaryStage.setTitle("beta");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
/*

    private void loadNewLevel()
    {
        if (queueLevels.getPresentLevel() != null)
            mainLayer.getChildren().removeAll(queueLevels.getPresentLevel().getLevelLayers());

        queueLevels.startNextLevel();

        mainLayer.getChildren().addAll(queueLevels.getPresentLevel().getLevelLayers());
    }

    public void loadUpdateMap()
    {
        mainLayer.getChildren().addAll(queueLevels.getPresentLevel().updateMap());
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
*/

}

