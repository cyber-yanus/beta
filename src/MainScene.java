import environment.MapController;
import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class MainScene extends Application {
    private Pane root = new Pane();
    private QueueLevels queueLevels = new QueueLevels();


    @Override
    public void start(Stage primaryStage)
    {
        loadNewLevel();

        primaryStage.setTitle("beta");
        primaryStage.setScene(new javafx.scene.Scene(root, 300, 275));
        primaryStage.show();
    }


    public void loadNewLevel()
    {
        removeMapFromScene();

        addMapToScene();
    }

    private void removeMapFromScene()
    {
        if(queueLevels.getNowLevel() != null)
            root.getChildren().removeAll(MapController.getInstance().loadGameMap(queueLevels.getNowGameMap()));

        queueLevels.startNextLevel();

    }

    private void addMapToScene()
    {
        root.getChildren().addAll(MapController.getInstance().loadGameMap(queueLevels.getNowGameMap()));
    }


}

