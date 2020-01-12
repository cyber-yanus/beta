package gameObjects;

import java.util.HashMap;
import java.util.Map;

public class ZoneLoader {

    private Map<String,Zone> valueZones = new HashMap<>();

    public ZoneLoader()
    {
        //возможно это плохой вариант, т.к. если мы склонируем все эти обьекты при взоимодействии с дним клоном мы затроним всех клонов
        valueZones.put("+",new Zone(2,"Н",PropertiesZone.PASSABLE));
        valueZones.put("A",new Zone(2,"А",PropertiesZone.PASSABLE));
        valueZones.put("C",new Zone(2,"З",PropertiesZone.IMPASSABLE));
        valueZones.put(" ",new Zone(2,"П",PropertiesZone.PASSABLE));
    }

    public void createZone(String mapValue)
    {
        Zone outZone = valueZones.get(mapValue);
        outZone.drawZone();
    }

}
