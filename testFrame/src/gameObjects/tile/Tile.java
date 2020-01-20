package gameObjects.tile;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;

import java.io.InputStream;

//плохо, что он екстендит ImageView
public class Tile extends ImageView
{
    private ContainerForTile containerForTile;

    public Tile(ContainerForTile containerForTile)
    {
        this.containerForTile = containerForTile;
        loadImage();
    }

    private void loadImage()
    {
        String urlImage = containerForTile.getUrlImage();
        int sizeZone = containerForTile.getSizeZone();

        InputStream input = getClass().getResourceAsStream(urlImage);
        Image image = new Image(input);

        super.setImage(image);
        super.setFitWidth(sizeZone);
        super.setFitHeight(sizeZone);
    }

    public void settingZone(Point coordinate)
    {
        int coordinateX = coordinate.x * containerForTile.getSizeZone();
        int coordinateY = coordinate.y * containerForTile.getSizeZone();

        super.setX(coordinateX);
        super.setY(coordinateY);
    }

}
