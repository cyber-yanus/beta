package gameObjects;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ZoneLoader {

    private Map<String,Container> valueZones = new HashMap<>();

    public ZoneLoader()
    {
        valueZones.put("+", new Container(20,"gameObjectsImages/test.png",PropertiesZone.PASSABLE));
       // valueZones.put("A",new Zone(20,"А",PropertiesZone.PASSABLE));
       // valueZones.put("C",new Zone(20,"З",PropertiesZone.IMPASSABLE));
       // valueZones.put(" ",new Zone(20,"П",PropertiesZone.PASSABLE));
    }

    public Zone createZone(String mapValue, Point coordinateZone)
    {
        //ошибка: идентичные обьект
        Container zoneContainer = valueZones.get(mapValue);

        Zone outZone = new Zone(zoneContainer);
        outZone.settingZone(coordinateZone);

        return outZone;
    }

}
