package gameTiles;

public class Tile
{
    private PropertiesTile property;

    private int lineOnMap = 0;
    private int columnOnMap = 0;


    public Tile(int lineOnMap, int columnOnMap, PropertiesTile property)
    {
        this.lineOnMap = lineOnMap;
        this.columnOnMap = columnOnMap;
        this.property = property;

    }

}
