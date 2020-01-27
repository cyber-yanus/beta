package gameMaps;

import gameObjects.GameObject;
import observer.GameEvent;
import observer.GameObserver;

public class Camera implements GameObserver {

    private int width;
    private int height;

    private int x = 0;
    private int y = 0;


    public Camera(int width, int height) {
        this.width = width;
        this.height = height;
    }


    /**
     * метод выститывания новых координат для камеры
     * @param xCoordinate положение персонажа на оси X
     * @param yCoordinate положение персонажа на оси Yp76
     */
    public void calculateNewCoordinate(int xCoordinate, int yCoordinate)
    {
        x = xCoordinate - width/2;
        y = yCoordinate - height/2;
    }


    private void updateValuesCamera(int xDirection, int yDirection, int widthPresentMap, int heightPresentMap)
    {
        int xCoordinate = x + xDirection;
        int yCoordinate = y + yDirection;

        int new_Width = xCoordinate + width;
        int new_Height = yCoordinate + height;

        if( (xCoordinate >= 0) && (yCoordinate >= 0) )
        {
            if ( (new_Width <= widthPresentMap) && (new_Height <= heightPresentMap) )
            {
                x += xDirection;
                y += yDirection;

                width = x + width;
                height = y + height;
            }
        }

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }


    @Override
    public void onNotify(GameEvent event, GameObject gameObject)
    {
        switch (event)
        {
            case MOVE_MAIN_ACTOR:
                break;
        }

    }

}
