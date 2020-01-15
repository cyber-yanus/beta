import environment.GameMap;
import gameObjects.mainPers.Pers;
import levels.FirstLevel;
import levels.Level;
import levels.SecondLevel;

import java.util.ArrayList;
import java.util.List;

public class QueueLevels {

    private Pers pers = new Pers();

    private Level nowLevel;
    private GameMap nowGameMap;
    private int numberNowLevel = -1;

    private List<Level> levels = new ArrayList<>();

    QueueLevels()
    {
        levels.add(new FirstLevel());
        levels.add(new SecondLevel());
    }

    private void loadNowLevel()
    {
        nowLevel = levels.get(numberNowLevel);
        nowGameMap = nowLevel.getMap();
    }

    public void startNextLevel()
    {
        numberNowLevel++;
        loadNowLevel();
    }

    public Level getNowLevel() {
        return nowLevel;
    }

    public GameMap getNowGameMap() {
        return nowGameMap;
    }
}
