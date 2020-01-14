package sample;

import environment.MapController;
import environment.Maps.FirstGameMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {

    private static FirstGameMap firstGameMap = new FirstGameMap();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane root = new Pane();
        primaryStage.setTitle("Hello World");



        root.getChildren().addAll(MapController.getInstance().loadGameMap(firstGameMap));



        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
