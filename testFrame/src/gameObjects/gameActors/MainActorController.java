package gameObjects.gameActors;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.InputStream;

public class MainActorController
{
    private ImageView imageView;

    private Actor presentPers = new MainActor("yanus",100,2);

    private int size = 50;

    public MainActorController()
    {
        String defaultImgUrl = "actorImages/normalActor.png";
        loadNewImagePers(defaultImgUrl);
    }

    public Actor getPresentPers() {
        return presentPers;
    }

    public void loadNewImagePers(String imgUrl)
    {
        InputStream inputStream = getClass().getResourceAsStream(imgUrl);
        Image image = new Image(inputStream);
        imageView = new ImageView(image);

        imageView.setFitHeight(size);
        imageView.setFitWidth(size);
    }

    public ImageView getImagePresentPers()
    {
        return imageView;
    }


}
