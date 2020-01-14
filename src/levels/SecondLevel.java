package levels;

import environment.GameMap;
import environment.Maps.SecondGameMap;

public class SecondLevel implements Level {

    private GameMap levelGameMap = new SecondGameMap();
    private int ID = 2;


    public SecondLevel()
    {}

    @Override
    public GameMap getMap() {
        return levelGameMap;
    }
}
