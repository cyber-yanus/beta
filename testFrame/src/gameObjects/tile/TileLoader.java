package gameObjects.tile;

import gameObjects.tile.Container;
import gameObjects.tile.PropertiesTile;
import gameObjects.tile.Tile;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TileLoader {

    private Map<String, gameObjects.tile.Container> valueZones = new HashMap<>();

    public TileLoader()
    {
        valueZones.put("+", new gameObjects.tile.Container(50,"tileImages/sky.png", PropertiesTile.PASSABLE));
        valueZones.put("A",new gameObjects.tile.Container(50,"tileImages/cloud.png", PropertiesTile.PASSABLE));
        valueZones.put("C",new gameObjects.tile.Container(50,"tileImages/soil.png", PropertiesTile.IMPASSABLE));
        valueZones.put(" ",new gameObjects.tile.Container(50,"tileImages/emptiness.png", PropertiesTile.PASSABLE));
    }

    public Tile createZone(String mapValue, Point coordinateZone)
    {
        Container zoneContainer = valueZones.get(mapValue);

        Tile outTile = new Tile(zoneContainer);
        outTile.settingZone(coordinateZone);

        return outTile;
    }

}
