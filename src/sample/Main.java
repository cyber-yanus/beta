package sample;

import environment.MapController;
import environment.Maps.FirstGameMap;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Main extends Application {

    private static FirstGameMap firstGameMap = new FirstGameMap();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane root = new Pane();//FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        root.getChildren().addAll(MapController.getInstance().loadGameMap(firstGameMap));

        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args)
    {
    //    MapController.getInstance().loadGameMap(firstGameMap);

    //    System.out.println("-------------------------\n");

    //    MapController.getInstance().updateGameMap(-1,1);


        launch(args);
    }
}
