package levels;

import gameMaps.tileMaps.FirstTileGameMap;
import gameMaps.GameMap;
import gameMaps.tileMaps.SecondTileGameMap;

import java.util.HashMap;
import java.util.Map;

public class QueueLevels {

    private Level presentLevel;

    private int numberPresentLevel = -1;

    private Map<Integer, GameMap> levelsMap = new HashMap<>();

    public QueueLevels()
    {
        levelsMap.put(0,new FirstTileGameMap());
        levelsMap.put(1,new SecondTileGameMap());
    }

    private void loadPresentLevel()
    {
        //получаем карту следующего уровня
        GameMap presentLevelGameMap = levelsMap.get(numberPresentLevel);

        //переходим на следующий уровень
      //  presentLevel = new Level(presentLevelGameMap);
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
