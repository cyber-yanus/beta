package levels;

import environment.GameMapController;
import environment.Maps.GameMap;

import gameObjects.gameActors.Actor;
import gameObjects.gameActors.MainActorController;

import javafx.scene.layout.Pane;

import java.awt.*;
import java.util.Collection;

public class Level{

    private GameMap levelGameMap;

    private GameMapController mapController = new GameMapController();

    private MainActorController mainActorController = new MainActorController();

    public Level(GameMap levelGameMap)
    {
        this.levelGameMap = levelGameMap;
    }

    public Collection<Pane> getLevelLayers()
    {
        mapController.decomposingMapIntoLayers(levelGameMap);

        return mapController.getLayers().getValueLayers();
    }

    public Actor getMainActor()
    {
        return mainActorController.getPresentPers();
    }

    public Collection<Pane> updateMap()
    {
        Point dir = mainActorController.getPresentPers().getDirectionPoint();

        mapController.updateCamera(dir.x, dir.y);

        return mapController.getLayers().getValueLayers();
    }

}
