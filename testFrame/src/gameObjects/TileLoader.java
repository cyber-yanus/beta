package gameObjects;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TileLoader {

    private Map<String,Container> valueZones = new HashMap<>();

    public TileLoader()
    {
        valueZones.put("+", new Container(50,"zoneImages/sky.png",PropertiesZone.PASSABLE));
        valueZones.put("A",new Container(50,"zoneImages/cloud.png",PropertiesZone.PASSABLE));
        valueZones.put("C",new Container(50,"zoneImages/soil.png",PropertiesZone.IMPASSABLE));
        valueZones.put(" ",new Container(50,"zoneImages/emptiness.png",PropertiesZone.PASSABLE));
    }

    public Tile createZone(String mapValue, Point coordinateZone)
    {
        Container zoneContainer = valueZones.get(mapValue);

        Tile outTile = new Tile(zoneContainer);
        outTile.settingZone(coordinateZone);

        return outTile;
    }

}
