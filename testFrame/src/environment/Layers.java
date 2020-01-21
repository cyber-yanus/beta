package environment;

import gameObjects.gameActors.Actor;
import gameObjects.tile.Tile;
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

    public void addLayer(List<Tile> tileList)
    {
        layersNumber++;

        Pane newLayer = new Pane();
        newLayer.getChildren().addAll(tileList);

        layersMap.put(layersNumber,newLayer);
    }

    public Collection<Pane> getValueLayers()
    {
        layersNumber = -1;

        return layersMap.values();
    }

    public void addActorToLayer(int layerNumber)
    {
        Pane actorLayer = layersMap.get(layerNumber);

        //actorLayer.getChildren().add();
    }


}
