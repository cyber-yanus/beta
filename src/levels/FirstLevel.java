package levels;

import environment.GameMap;
import environment.Maps.FirstGameMap;

public class FirstLevel implements Level {

    private GameMap levelGameMap = new FirstGameMap();

    public FirstLevel()
    {
    }

    @Override
    public GameMap getMap() {
        return levelGameMap;
    }



}
