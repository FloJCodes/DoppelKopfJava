package hwr.oop.doppelkopf;

import java.util.Arrays;
import java.util.List;

public enum Symbol {
    NEUN(0), KOENIG(4), ZEHN(10), ASS(11), BUBE(2), DAME(3);

    private final int countValue;

    Symbol(int pCountValue) {
        this.countValue = pCountValue;
    }

    public int getCountValue(){
        return countValue;
    }

    public static List<Symbol> allSymbols() {
        return Arrays.asList(Symbol.values());
    }
}

