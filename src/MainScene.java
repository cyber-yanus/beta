import environment.GameMap;
import environment.MapController;
import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import levels.Level;


public class MainScene extends Application {
    private Pane root = new Pane();
    private QueueLevels queueLevels = new QueueLevels();


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("beta");
        primaryStage.setScene(new javafx.scene.Scene(root, 300, 275));
        primaryStage.show();
    }

    public void startNewLevel(Level newLevel)
    {
        removeMapFromScene();

        nowLevel = newLevel;
        nowGameMap = nowLevel.getMap();

        addMapToScene();
    }

    private void removeMapFromScene()
    {
        if(nowLevel != null)
            root.getChildren().removeAll(MapController.getInstance().loadGameMap(nowGameMap));

    }

    private void addMapToScene()
    {
        root.getChildren().addAll(MapController.getInstance().loadGameMap(nowGameMap));
    }


}

