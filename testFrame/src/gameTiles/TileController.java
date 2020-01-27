package gameTiles;

import java.util.HashMap;
import java.util.Map;

import java.awt.*;

public class TileController
{
    private int tileSize = 50;

    private Map<String, PropertiesTile> tileValues = new HashMap<>();

    public TileController()
    {
        tileValues.put("+", PropertiesTile.PASSABLE);
        tileValues.put("A", PropertiesTile.PASSABLE);
        tileValues.put("C", PropertiesTile.IMPASSABLE);
        tileValues.put(" ", PropertiesTile.PASSABLE);
    }

    public void createTile(String mapValue, Point coordinateTile)
    {
        PropertiesTile property = tileValues.get(mapValue);

        int xCoordinate = coordinateTile.x;
        int yCoordinate = coordinateTile.y;

        Tile tile = new Tile(xCoordinate, yCoordinate, property);
    }

/*
    private void loadImage()
    {
        int sizeZone = containerForTile.getSizeZone();
        String urlImage = containerForTile.getUrlImage();

        InputStream input = getClass().getResourceAsStream(urlImage);
        javafx.scene.image.Image image = new Image(input);

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
 */


}
