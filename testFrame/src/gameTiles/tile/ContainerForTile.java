package gameTiles.tile;

public class ContainerForTile
{
    private PropertiesTile propertiesTile;

    private String urlImage;

    private int sizeZone;

    public ContainerForTile(int sizeZone, String urlImage, PropertiesTile propertiesTile)
    {
        this.sizeZone = sizeZone;
        this.urlImage = urlImage;
        this.propertiesTile = propertiesTile;
    }

    public PropertiesTile getPropertiesTile()
    {
        return propertiesTile;
    }

    public int getSizeZone() {
        return sizeZone;
    }

    public String getUrlImage() {
        return urlImage;
    }


}
