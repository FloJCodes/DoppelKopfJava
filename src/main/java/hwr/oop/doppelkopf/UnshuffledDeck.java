package hwr.oop.doppelkopf;

import java.util.ArrayList;
import java.util.List;

public class UnshuffledDeck {
    private List<Card> unshuffledDeck = new ArrayList<Card>();
    private List<Color> unshuffledDeckColor = Color.allColors();
    private List<Symbol> unshuffledDeckSymbol = Symbol.allSymbols();

    public void fillList() {
        for(Color i : unshuffledDeckColor){
            for(Symbol j : unshuffledDeckSymbol){
                unshuffledDeck.add(new Card(j, i));
            }
        }
    }

    public void printDeck(){
        for(Card i : unshuffledDeck){
            i.printCard();
        }
    }

    public boolean isEmpty() {
        return unshuffledDeck.isEmpty();
    }
}