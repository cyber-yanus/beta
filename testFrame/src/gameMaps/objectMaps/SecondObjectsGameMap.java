package gameMaps.objectMaps;

import gameMaps.GameMap;

public class SecondObjectsGameMap implements GameMap {

    private final String[][] mas = {
            {"+","+","+","+","+","+"},
            {"+","+","+","A","+","+"},
            {"C","+","+","+","+","+"},
            {"C","C","+","+","C","+"},
            {"C","C","C","C","C","C"},
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
