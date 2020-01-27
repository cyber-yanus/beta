package gameMaps;

import gameObjects.Actor;
import gameObjects.GameObject;
import gameTiles.tile.Tile;
import javafx.scene.layout.Pane;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Layers
{
    private Map<Integer, Pane> layersMap = new HashMap<>();

    private int layersNumber = -1;


    public Layers()
    {
    }

    //надо сменить аргумент на общий
    public void addTileLayer(List<Tile> tileList)
    {
        layersNumber++;

        Pane newLayer = new Pane();
        newLayer.getChildren().addAll(tileList);

        layersMap.put(layersNumber,newLayer);
    }

    public void addGameObjectLayer(List<GameObject> gameObjectList)
    {
        layersNumber++;

        Pane newLayer = new Pane();
        newLayer.getChildren().addAll();

        layersMap.put(layersNumber,newLayer);
    }


    public Collection<Pane> getValueLayers()
    {
        layersNumber = -1;

        return layersMap.values();
    }

    public void addActorToLayer(int layerNumber, Actor actor)
    {
        Pane actorLayer = layersMap.get(layerNumber);

        //actorLayer.getChildren().add();
    }


}
