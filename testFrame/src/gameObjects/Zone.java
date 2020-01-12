package gameObjects;

public class Zone {

    private PropertiesZone propertiesZone;
    public int sizeZone;
    private String image = "";

    public Zone(int sizeZone, String image, PropertiesZone propertiesZone)
    {
        this.sizeZone = sizeZone;
        this.image = image;
        this.propertiesZone = propertiesZone;
    }

    public void drawZone()
    {
        System.out.print(image+" ");
    }

    public PropertiesZone getPropertiesZone() {
        return propertiesZone;
    }
}
