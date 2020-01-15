package environment;

import gameObjects.tile.Tile;
import gameObjects.tile.TileLoader;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MapController
{
    private Camera camera;

    private GameMap presentGameMap;

    private TileLoader tileLoader = new TileLoader();
    private List<Tile> tileList = new ArrayList<>();

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

    //возможно стоит поменять название метода
    public List<Tile> loadGameMap(GameMap gameMap)
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

                Tile newTile = tileLoader.createZone(mapElement,coordinateZone);
                tileList.add(newTile);
            }
        }

        return tileList;
    }


    public List<Tile> updateGameMap(int lineDirection, int columnDirection)
    {
            if((line + lineDirection >= 0) && (column + columnDirection >= 0))
            {
                line += lineDirection;
                column += columnDirection;
            }

            return loadGameMap(presentGameMap);
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
