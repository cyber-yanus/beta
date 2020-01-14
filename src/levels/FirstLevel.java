package levels;

import environment.GameMap;
import environment.Maps.FirstGameMap;

public class FirstLevel implements Level {

    private GameMap levelGameMap = new FirstGameMap();
    private int ID = 1;

    public FirstLevel()
    {
    }

    @Override
    public GameMap getMap() {
        return levelGameMap;
    }



}
