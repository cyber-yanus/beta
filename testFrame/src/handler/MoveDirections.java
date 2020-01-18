package handler;

import java.awt.*;

public enum MoveDirections {
    UP(0,-1),
    DOWN(0,1),
    LEFT(-1,0),
    RIGHT(1,0);

    private Point direction;

    MoveDirections(int x, int y)
    {
        direction = new Point(x,y);
    }

    public Point getDirection()
    {
        return direction;
    }
}
