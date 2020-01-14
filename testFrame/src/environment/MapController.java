package environment;

import gameObjects.Zone;
import gameObjects.ZoneLoader;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MapController
{
    private Camera camera;

    private GameMap presentGameMap;

    private ZoneLoader zoneLoader = new ZoneLoader();
    private List<ImageView> zoneList = new ArrayList<>();

    private static MapController mapController;

    private int line=0;
    private int column=0;


    private MapController()
    {
        camera = new Camera(4,4);
    }


    public static MapController getInstance()
    {
        return mapController == null ? mapController = new MapController() : mapController;
    }


    /**
     * метод загрузки карты
     * @param gameMap карта которую мы загружаем
     */
    public List<ImageView> loadGameMap(GameMap gameMap)
    {
        presentGameMap = gameMap;

        int width = camera.getWidth() + line;
        int height = camera.getHeight() + column;

        for(int i = line; i<width; i++)
        {
            for(int j = column; j<height; j++)
            {
                String mapElement = gameMap.getMapElement(i, j);

                Point coordinateZone = new Point(j,i);

                Zone newZone = zoneLoader.createZone(mapElement,coordinateZone);
                zoneList.add(newZone);
            }
        }

        return zoneList;
    }

    /**
     * метод обновления карты при движении персонажа
     * @param lineDirection значение напрвления по оси OX (1 -- вправа//-1 -- влево//0 -- стоит на месте)
     * @param columnDirection значение направления по оси OY (1 -- вниз//-1 -- вверх//0 -- стоит на месте)
     */
    public void updateGameMap(int lineDirection, int columnDirection)
    {
            if((line + lineDirection >= 0) && (column + columnDirection >= 0))
            {
                line += lineDirection;
                column += columnDirection;
            }

            loadGameMap(presentGameMap);
    }

}
