package observer;

import gameObjects.GameObject;

public interface GameObserver
{
    void onNotify(GameEvent event, GameObject gameObject);
}
