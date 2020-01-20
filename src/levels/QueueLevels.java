package levels;

import environment.Maps.FirstGameMap;
import environment.Maps.GameMap;
import environment.Maps.SecondGameMap;

import java.util.HashMap;
import java.util.Map;

public class QueueLevels {

    private Level presentLevel;

    private int numberPresentLevel = -1;

    private Map<Integer, GameMap> levelsMap = new HashMap<>();

    public QueueLevels()
    {
        levelsMap.put(1,new FirstGameMap());
        levelsMap.put(2,new SecondGameMap());
    }

    private void loadPresentLevel()
    {
        //получаем карту следующего уровня
        GameMap presentLevelMap = levelsMap.get(numberPresentLevel);

        //переходим на следующий уровень
        presentLevel = new Level(presentLevelMap);
    }

    public void startNextLevel()
    {
        numberPresentLevel++;

        loadPresentLevel();
    }

    public Level getPresentLevel() {
        return presentLevel;
    }



}
