package gameObjects.mainPers;

public class PresentMainPers {

    private GameActor presentPers;
    private static PresentMainPers presentMainPers;


    private PresentMainPers(){}

    public static PresentMainPers getInstance()
    {
        return presentMainPers == null ? presentMainPers = new PresentMainPers() : presentMainPers;
    }

    public void settingPresentPers(GameActor actor)
    {
        presentPers = actor;
    }

    public GameActor getPresentPers()
    {
        return presentPers;
    }



}
