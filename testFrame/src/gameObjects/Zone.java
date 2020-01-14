package gameObjects;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.io.InputStream;

public class Zone extends ImageView{

    private PropertiesZone propertiesZone;
    public int sizeZone;
    private ImageView imageview;

    public Zone(int sizeZone, String urlImage, PropertiesZone propertiesZone)
    {
        this.sizeZone = sizeZone;
        this.propertiesZone = propertiesZone;

        loadImage(urlImage);
    }

    private void loadImage(String urlImage)
    {
        InputStream input = getClass().getResourceAsStream(urlImage);
        Image image = new Image(input);

        //imageview = new ImageView(image);
        super.setImage(image);
        super.setFitWidth(sizeZone);
        super.setFitHeight(sizeZone);
    }

    public void settingZone(Point coordinate)
    {
        super.setX(coordinate.x);
        super.setY(coordinate.y);
    }

    public PropertiesZone getPropertiesZone() {
        return propertiesZone;
    }
}
