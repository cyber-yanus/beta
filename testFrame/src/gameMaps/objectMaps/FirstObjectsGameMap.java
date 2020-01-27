package gameMaps.objectMaps;

import gameMaps.GameMap;

public class FirstObjectsGameMap implements GameMap {

    private final String[][] mas = {
            {" "," "," "," "," "," "},
            {" ","P"," "," "," "," "},
            {"E"," ","M"," "," "," "},
            {" "," "," "," "," "," "},
            {" "," "," "," ","T"," "},
            {" "," "," "," "," "," "}
    };

    @Override
    public String getMapElement(int line, int column)
    {
        return mas[line][column];
    }

    @Override
    public int getWidthMap() {
        return mas[0].length;
    }

    @Override
    public int getHeightMap() {
        return mas.length;
    }
}
