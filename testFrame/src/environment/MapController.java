package environment;

import environment.Maps.GameMap;

import gameObjects.tile.Tile;
import gameObjects.tile.TileLoader;

import java.awt.*;

import java.util.ArrayList;
import java.util.List;

public class MapController {
    private Camera camera;

    private GameMap presentGameMap;

    private TileLoader tileLoader = new TileLoader();
    private List<Tile> tileList = new ArrayList<>();

    public MapController()
    {
        camera = new Camera(4, 4);
    }

    public List<Tile> getTilesValues(GameMap gameMap)
    {
        presentGameMap = gameMap;

        tileList.clear();

        int i = camera.getX();
        int j = camera.getY();

        int width = camera.getWidth();
        int height = camera.getHeight();

        for (; i < width; i++)
        {
            for (; j < height; j++)
            {
                String mapElement = gameMap.getMapElement(i, j);

                int xCoordinate = j - camera.getY();
                int yCoordinate = i - camera.getX();

                Point coordinateZone = new Point(xCoordinate, yCoordinate);

                Tile newTile = tileLoader.createZone(mapElement, coordinateZone);
                tileList.add(newTile);
            }

            j = camera.getY();
        }

        return tileList;
    }


    public List<Tile> updateCamera(int lineDirection, int columnDirection)
    {
        int widthMap = presentGameMap.getWidthMap();
        int heightMap = presentGameMap.getHeightMap();

        camera.updateValuesCamera(lineDirection, columnDirection, widthMap, heightMap);

        return getTilesValues(presentGameMap);
    }


}
