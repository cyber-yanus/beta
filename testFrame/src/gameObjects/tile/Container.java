package gameObjects.tile;

public class Container {

    private PropertiesTile propertiesTile;
    private int sizeZone;
    private String urlImage;

    Container(int sizeZone, String urlImage, PropertiesTile propertiesTile)
    {
        this.sizeZone = sizeZone;
        this.urlImage = urlImage;
        this.propertiesTile = propertiesTile;
    }

    public PropertiesTile getPropertiesTile() {
        return propertiesTile;
    }

    public int getSizeZone() {
        return sizeZone;
    }

    public String getUrlImage() {
        return urlImage;
    }


}
