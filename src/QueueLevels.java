import environment.GameMap;
import gameObjects.Pers;
import levels.Level;

public class QueueLevels {

    private Pers pers = new Pers();

    private Level nowLevel;
    private GameMap nowGameMap;



    QueueLevels()
    {
    }


    public Level getNowLevel() {
        return nowLevel;
    }

    public GameMap getNowGameMap() {
        return nowGameMap;
    }
}
