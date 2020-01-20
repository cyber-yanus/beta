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

    private int line = 0;
    private int column = 0;


    public MapController() {
        camera = new Camera(4, 4);
    }

    public List<Tile> getTilesValues(GameMap gameMap)
    {
        tileList.removeAll(tileList);

        presentGameMap = gameMap;

        int width = camera.getWidth() + line;
        int height = camera.getHeight() + column;

        for (int i = line; i < width; i++)
        {
            for (int j = column; j < height; j++)
            {
                String mapElement = gameMap.getMapElement(i, j);

                int xCoordinate = j - column;
                int yCoordinate = i - line;

                Point coordinateZone = new Point(xCoordinate, yCoordinate);

                Tile newTile = tileLoader.createZone(mapElement, coordinateZone);
                tileList.add(newTile);
            }
        }

        return tileList;
    }


    public List<Tile> updateGameMap(int lineDirection, int columnDirection)
    {
        int x = line + lineDirection;
        int y = column + columnDirection;

        int widthPresentMap = presentGameMap.getWidthMap();
        int heightPresentMap = presentGameMap.getHeightMap();

        if ((x >= 0) && (y >= 0))
        {
            if((x + camera.getWidth() <= widthPresentMap) && (y + camera.getHeight() <= heightPresentMap))
            {
                line += lineDirection;
                column += columnDirection;
            }
        }

        return getTilesValues(presentGameMap);
    }


}
