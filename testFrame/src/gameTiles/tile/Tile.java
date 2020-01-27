package gameTiles.tile;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;

import java.io.InputStream;

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
        int sizeZone = containerForTile.getSizeZone();
        String urlImage = containerForTile.getUrlImage();

        InputStream input = getClass().getResourceAsStream(urlImage);
        Image image = new Image(input);

        super.setImage(image);
        super.setFitWidth(sizeZone);
        super.setFitHeight(sizeZone);
    }

    public void settingTile(Point coordinate)
    {
        int coordinateX = coordinate.x * containerForTile.getSizeZone();
        int coordinateY = coordinate.y * containerForTile.getSizeZone();

        super.setX(coordinateX);
        super.setY(coordinateY);
    }

}
