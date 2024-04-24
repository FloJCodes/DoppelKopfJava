package hwr.oop.doppelkopf;

import java.util.Arrays;
import java.util.List;

public enum Color {
    KREUZ, PIK, HERZ, KARO;

    public static List<Color> allColors() {
        return Arrays.asList(Color.values());
    }

}