package gameMaps;

import gameObjects.GameObject;
import gameObjects.GameObjectLoader;
import gameTiles.TileLoader;
import gameTiles.tile.Tile;

import java.awt.*;

public class GameMapController {

    private GameMap objectsGameMap;
    private GameMap tilesGameMap;

    private TileLoader tileLoader = new TileLoader();

    private GameObjectLoader gameObjectLoader = new GameObjectLoader();

    private Camera camera;

    public GameMapController()
    {
        camera = new Camera(4,4);
    }

    public void addMaps(GameMap objectsGameMap, GameMap tilesGameMap)
    {
        this.objectsGameMap = objectsGameMap;
        this.tilesGameMap = tilesGameMap;
    }

    public void decomposingMapIntoLayers()
    {
        int i = camera.getX();
        int j = camera.getY();

        int width = camera.getWidth();
        int height = camera.getHeight();

        for (; i < width; i++)
        {
            for (; j < height; j++)
            {
                String tilesMapElement = tilesGameMap.getMapElement(i, j);
                String objectMapElement = objectsGameMap.getMapElement(i, j);

                int xCoordinate = j - camera.getY();
                int yCoordinate = i - camera.getX();

                Point coordinateZone = new Point(xCoordinate, yCoordinate);

                Tile newTile = tileLoader.createTile(tilesMapElement, coordinateZone);
                GameObject gameObject = gameObjectLoader.createGameObject(objectMapElement, coordinateZone);




                // tileList.add(newTile);
            }
            //layers.addLayer(tileList);

            //tileList.clear();

            j = camera.getY();
        }


    }

    public GameMap getObjectsGameMap()
    {
        return objectsGameMap;
    }

    public GameMap getTilesGameMap()
    {
        return tilesGameMap;
    }


}
