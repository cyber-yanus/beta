package levels;

import environment.Maps.FirstGameMap;
import environment.Maps.SecondGameMap;

import java.util.ArrayList;
import java.util.List;

public class QueueLevels {

    private Level presentLevel;

    private int numberPresentLevel = -1;

    private List<Level> levels = new ArrayList<>();

    //надо создать hashMap для уровней

    public QueueLevels()
    {
        Level firstLevel = new Level(new FirstGameMap());
        Level secondLevel = new Level(new SecondGameMap());

        levels.add(firstLevel);
        levels.add(secondLevel);
    }

    private void loadPresentLevel()
    {
        //переходим на следующий уровень
        presentLevel = levels.get(numberPresentLevel);
    }

    public Level startNextLevel()
    {
        numberPresentLevel++;

        loadPresentLevel();

        return presentLevel;
    }

    public Level getPresentLevel() {
        return presentLevel;
    }



}
