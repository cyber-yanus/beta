package environment.Maps;

import environment.GameMap;

/**
 * класс описывающий карту на первом уровне
 */
public class FirstGameMap implements GameMap
{
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
}
