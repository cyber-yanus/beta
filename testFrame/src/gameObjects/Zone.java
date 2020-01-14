package gameObjects;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.io.InputStream;

public class Zone extends ImageView{

    private Container container;

    public Zone(Container container)
    {
        this.container = container;
        loadImage();
    }

    private void loadImage()
    {
        String urlImage = container.getUrlImage();
        int sizeZone = container.getSizeZone();

        InputStream input = getClass().getResourceAsStream(urlImage);
        Image image = new Image(input);

        super.setImage(image);
        super.setFitWidth(sizeZone);
        super.setFitHeight(sizeZone);
    }

    public void settingZone(Point coordinate)
    {
        super.setX(coordinate.x);
        super.setY(coordinate.y);
    }

}
