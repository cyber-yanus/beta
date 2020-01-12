package environment;

import gameObjects.ZoneLoader;

import java.util.zip.CheckedInputStream;

public class MapController
{
    private Camera camera;

    private ZoneLoader zoneLoader = new ZoneLoader();

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

    public void loadGameMap(GameMap gameMap)
    {
        int width = camera.getWidth() + line;
        int height = camera.getHeight() + column;

        for(; line<width; line++)
        {
            for(; column<height; column++)
            {
                String mapElement = gameMap.getMapElement(line, column);
                zoneLoader.createZone(mapElement);
            }
            System.out.println();
        }

    }

    public void updateGameMap(int lineDirection, int columnDirection)
    {
        line += lineDirection;
        column += columnDirection;

        loadGameMap();
    }

}
