package levels;

import environment.GameMap;
import environment.Maps.SecondGameMap;

public class SecondLevel implements Level {

    private GameMap levelGameMap = new SecondGameMap();

    public SecondLevel()
    {}

    @Override
    public GameMap getMap() {
        return levelGameMap;
    }
}
