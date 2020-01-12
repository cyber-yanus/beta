package sample;

import environment.MapController;
import environment.Maps.FirstGameMap;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static FirstGameMap firstGameMap = new FirstGameMap();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        MapController.getInstance().loadGameMap(firstGameMap);

        System.out.println("-------------------------\n");

        MapController.getInstance().updateGameMap(1,1);


        launch(args);
    }
}
