package gameObjects.gameActors;

import handler.MoveDirections;

import javafx.scene.image.Image;

import java.io.InputStream;

public abstract class GameActor {

    protected int heals = 100;
    protected int speed = 2;
    protected String name = "";

    protected String urlImage = "";

    GameActor(String urlImage, String name, int heals, int speed)
    {
        this.urlImage = urlImage;
        this.name = name;
        this.heals = heals;

        loadGameActorImage();
    }

    GameActor ()
    {}

    private void loadGameActorImage()
    {
        InputStream inputStream = getClass().getResourceAsStream(urlImage);
        Image image = new Image(inputStream);
        //super.setImage(image);
    }


    public void fire() {}


    public void move(MoveDirections moveDirections)
    {

    }






}
