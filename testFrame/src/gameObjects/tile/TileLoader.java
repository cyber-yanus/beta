package gameObjects.tile;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TileLoader {

    private Map<String, ContainerForTile> tileValues = new HashMap<>();

    public TileLoader()
    {
        tileValues.put("+", new ContainerForTile(50,"tileImages/sky.png", PropertiesTile.PASSABLE));
        tileValues.put("A", new ContainerForTile(50,"tileImages/cloud.png", PropertiesTile.PASSABLE));
        tileValues.put("C", new ContainerForTile(50,"tileImages/soil.png", PropertiesTile.IMPASSABLE));
        tileValues.put(" ", new ContainerForTile(50,"tileImages/emptiness.png", PropertiesTile.PASSABLE));
    }

    public Tile createZone(String mapValue, Point coordinateZone)
    {
        ContainerForTile zoneContainerForTile = tileValues.get(mapValue);

        Tile outTile = new Tile(zoneContainerForTile);
        outTile.settingZone(coordinateZone);

        return outTile;
    }

}
