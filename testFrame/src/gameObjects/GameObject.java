package gameObjects;

import java.util.List;

public abstract class GameObject
{
     protected int lineOnMap = 0;
     protected int columnOnMap = 0;

     public GameObject(int lineOnMap, int columnOnMap)
     {
         this.lineOnMap = lineOnMap;
         this.columnOnMap = columnOnMap;
     }

}
