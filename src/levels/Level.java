package levels;

import environment.Maps.GameMap;
import environment.MapController;

import gameObjects.gameActors.Actor;
import gameObjects.gameActors.MainActorController;
import gameObjects.tile.Tile;

import java.awt.*;
import java.util.List;

public class Level{

    private GameMap levelGameMap;
    private MapController mapController = new MapController();

    private MainActorController mainActorController = new MainActorController();

    public Level(GameMap levelGameMap)
    {
        this.levelGameMap = levelGameMap;
    }

    public List<Tile> getTiles()
    {
        return mapController.getTilesValues(levelGameMap);
    }

    public Actor getMainActor()
    {
        return mainActorController.getPresentPers();
    }

    public List<Tile> updateMap()
    {
        Point dir = mainActorController.getPresentPers().getDirectionPoint();

        return mapController.updateGameMap(dir.x, dir.y);
    }

}
