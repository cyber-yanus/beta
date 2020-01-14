package gameObjects;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ZoneLoader {

    private Map<String,Zone> valueZones = new HashMap<>();

    public ZoneLoader()
    {
        valueZones.put("+",new Zone(20,"gameObjectsImages/test.png",PropertiesZone.PASSABLE));
       // valueZones.put("A",new Zone(20,"А",PropertiesZone.PASSABLE));
       // valueZones.put("C",new Zone(20,"З",PropertiesZone.IMPASSABLE));
       // valueZones.put(" ",new Zone(20,"П",PropertiesZone.PASSABLE));
    }

    public Zone createZone(String mapValue, Point coordinateZone)
    {
        //ошибка: идентичные обьекты
        Zone outZone = valueZones.get(mapValue);
        outZone.settingZone(coordinateZone);

        return outZone;
    }

}
