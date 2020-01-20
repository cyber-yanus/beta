package environment;

import java.awt.*;

public class Camera {

    private int width;
    private int height;

    private int x = 0;
    private int y = 0;

    private int xSize;
    private int ySize;

    public Camera(int width, int height) {
        this.width = width;
        this.height = height;

        calculateSize();
    }

    public Camera(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;

        this.width = width;
        this.height = height;

        calculateSize();
    }


    private void calculateSize()
    {
        xSize = width - x;
        ySize = height -y;
    }

    public void updateValuesCamera(int xDirection, int yDirection, int widthPresentMap, int heightPresentMap)
    {
        int xCoordinate = x + xDirection;
        int yCoordinate = y + yDirection;

        int new_Width = xCoordinate + xSize;
        int new_Height = yCoordinate + ySize;

        if( (xCoordinate >= 0) && (yCoordinate >= 0) )
        {
            if ( (new_Width <= widthPresentMap) && (new_Height <= heightPresentMap) )
            {
                x += xDirection;
                y += yDirection;

                width = x + xSize;
                height = y +ySize;
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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
