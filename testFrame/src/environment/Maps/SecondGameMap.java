package environment.Maps;

import environment.GameMap;

public class SecondGameMap implements GameMap {
    private final String[][] mas = {
            {"A","+","+","+","+","+"},
            {"+","+","+","A","+","+"},
            {"+","A","+","+","A","+"},
            {"+","+","+","C","C","+"},
            {"C","C","C","C","C","C"},
            {" "," "," "," "," "," "}
    };

    @Override
    public String getMapElement(int line, int column)
    {
        return mas[line][column];
    }
}
