package environment;

import java.awt.*;

public class Camera {

    private int width;
    private int height;

    public Camera(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public Camera(Point cameraSize)
    {
        width = cameraSize.x;
        height = cameraSize.y;
    }


    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
