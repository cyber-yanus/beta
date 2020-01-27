import javafx.animation.AnimationTimer;

public class GameLoop extends AnimationTimer
{

    private MainScene mainScene;

    public GameLoop(MainScene mainScene)
    {
        this.mainScene = mainScene;
    }

    @Override
    public void handle(long l)
    {
     //   mainScene.loadUpdateMap();
    }


}
