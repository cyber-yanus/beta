package environment;

import gameObjects.ZoneLoader;

public class MapController
{
    private Camera camera;

    private GameMap presentGameMap;

    private ZoneLoader zoneLoader = new ZoneLoader();

    private static MapController mapController;

    private int line=0;
    private int column=0;


    private MapController()
    {
        camera = new Camera(5,4);
    }


    public static MapController getInstance()
    {
        return mapController == null ? mapController = new MapController() : mapController;
    }


    /**
     * метод загрузки карты
     * @param gameMap карта которую мы загружаем
     */
    public void loadGameMap(GameMap gameMap)
    {
        presentGameMap = gameMap;

        int width = camera.getWidth() + line;
        int height = camera.getHeight() + column;

        for(int i = line; i<width; i++)
        {
            for(int j = column; j<height; j++)
            {
                String mapElement = gameMap.getMapElement(i, j);
                zoneLoader.createZone(mapElement);
            }
            System.out.println();
        }
    }

    /**
     * метод обновления карты при движении персонажа
     * @param lineDirection значение напрвления по оси OX (1 -- вправа//-1 -- влево//0 -- стоит на месте)
     * @param columnDirection значение направления по оси OY (1 -- вниз//-1 -- вверх//0 -- стоит на месте)
     */
    public void updateGameMap(int lineDirection, int columnDirection)
    {
            //он может уйти в минусовую степень! Может стоит создать отдельный класс?
            line += lineDirection;
            column += columnDirection;

            loadGameMap(presentGameMap);
    }

}
