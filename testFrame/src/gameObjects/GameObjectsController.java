package gameObjects;

import gameObjects.actors.Enemy;
import gameObjects.actors.MainActor;
import gameObjects.actors.Civilian;

import gameObjects.environment.Stone;
import gameObjects.environment.Tree;

import java.util.HashMap;
import java.util.Map;

import java.awt.*;

public class GameObjectsController
{

    private Actor presentMainActor;

    private Map<Point, GameObject> gameObjectMap = new HashMap<>();

    private int size = 50;

    public void createGameObject(String mapValue, Point coordinateZone)
    {
        GameObject gameObject = null;

        int lineOnMap = coordinateZone.x;
        int columnOnMap = coordinateZone.y;

        switch (mapValue)
        {
            case "P":
                gameObject = new Civilian(lineOnMap, columnOnMap,100,1);
                break;
            case "E":
                gameObject = new Enemy(lineOnMap, columnOnMap,100,1);
                break;
            case "T":
                gameObject = new Tree(lineOnMap, columnOnMap);
                break;
            case "M":
                presentMainActor = new MainActor(lineOnMap, columnOnMap,100,1);
                break;
            case "S":
                gameObject = new Stone(lineOnMap, columnOnMap);
                break;
        }

        if (gameObject != null)
            gameObjectMap.put(coordinateZone, gameObject);

    }

    public Actor getPresentMainActor() {
        return presentMainActor;
    }

}
