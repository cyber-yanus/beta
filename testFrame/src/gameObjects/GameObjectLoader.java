package gameObjects;

import gameObjects.actors.Enemy;
import gameObjects.actors.MainActor;
import gameObjects.actors.PeaseCivilion;

import gameObjects.environment.Stone;
import gameObjects.environment.Tree;

import java.awt.*;

public class GameObjectLoader {

    public GameObject createGameObject(String mapValue, Point coordinateZone)
    {
        GameObject gameObject;

        int lineOnMap = coordinateZone.x;
        int columnOnMap = coordinateZone.y;

        switch (mapValue)
        {
            case "P":
                gameObject = new PeaseCivilion(lineOnMap, columnOnMap,100,1);
                break;
            case "E":
                gameObject = new Enemy(lineOnMap, columnOnMap,100,1);
                break;
            case "T":
                gameObject = new Tree(lineOnMap, columnOnMap);
                break;
            case "M":
                gameObject = new MainActor(lineOnMap, columnOnMap,100,1);
                break;
            case "S":
                gameObject = new Stone(lineOnMap, columnOnMap);
                break;

            default: gameObject = null;
        }

        return gameObject;
    }




}
