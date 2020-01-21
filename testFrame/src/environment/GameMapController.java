package environment;

import environment.Maps.GameMap;

import gameObjects.tile.Tile;
import gameObjects.tile.TileLoader;

import java.awt.*;

import java.util.ArrayList;
import java.util.List;

public class GameMapController
{
    private Camera camera;

    private GameMap presentGameMap;

    private TileLoader tileLoader = new TileLoader();
    private List<Tile> tileList = new ArrayList<>();

    private Layers layers = new Layers();

    public GameMapController()
    {
        camera = new Camera(4, 4);
    }

    public void decomposingMapIntoLayers(GameMap gameMap)
    {
        presentGameMap = gameMap;

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
            layers.addLayer(tileList);

            tileList.clear();

            j = camera.getY();
        }
    }


    public void updateCamera(int lineDirection, int columnDirection)
    {
        int widthMap = presentGameMap.getWidthMap();
        int heightMap = presentGameMap.getHeightMap();

        camera.updateValuesCamera(lineDirection, columnDirection, widthMap, heightMap);

        decomposingMapIntoLayers(presentGameMap);
    }

    public Layers getLayers() {
        return layers;
    }
}
