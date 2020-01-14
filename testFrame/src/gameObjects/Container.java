package gameObjects;

public class Container {

    private PropertiesZone propertiesZone;
    private int sizeZone;
    private String urlImage;

    Container(int sizeZone, String urlImage, PropertiesZone propertiesZone)
    {
        this.sizeZone = sizeZone;
        this.urlImage = urlImage;
        this.propertiesZone = propertiesZone;
    }

    public PropertiesZone getPropertiesZone() {
        return propertiesZone;
    }

    public int getSizeZone() {
        return sizeZone;
    }

    public String getUrlImage() {
        return urlImage;
    }


}
