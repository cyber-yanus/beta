package gameObjects.gameActors;

public class PresentMainPers
{
    private GameActor presentPers = new NormalPers();

    private static PresentMainPers presentMainPers;

    private PresentMainPers(){}

    public static PresentMainPers getInstance()
    {
        return presentMainPers == null ? presentMainPers = new PresentMainPers() : presentMainPers;
    }

    public void addPresentPers(GameActor actor)
    {
        presentPers = actor;
    }

    public GameActor getPresentPers()
    {
        return presentPers;
    }



}
