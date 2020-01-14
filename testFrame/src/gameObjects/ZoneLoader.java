package gameObjects;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ZoneLoader {

    private Map<String,Container> valueZones = new HashMap<>();

    public ZoneLoader()
    {
        valueZones.put("+", new Container(50,"gameObjectsImages/sky.png",PropertiesZone.PASSABLE));
        valueZones.put("A",new Container(50,"gameObjectsImages/cloud.png",PropertiesZone.PASSABLE));
        valueZones.put("C",new Container(50,"gameObjectsImages/soil.png",PropertiesZone.IMPASSABLE));
        valueZones.put(" ",new Container(50,"gameObjectsImages/emptiness.png",PropertiesZone.PASSABLE));
    }

    public Zone createZone(String mapValue, Point coordinateZone)
    {
        Container zoneContainer = valueZones.get(mapValue);

        Zone outZone = new Zone(zoneContainer);
        outZone.settingZone(coordinateZone);

        return outZone;
    }

}
