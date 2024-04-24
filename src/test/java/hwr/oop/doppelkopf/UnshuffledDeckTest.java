package hwr.oop.doppelkopf;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UnshuffledDeckTest {
    @Test
    void CardDeck_IsNotEmpty() {
        UnshuffledDeck unshuffledDeck = new UnshuffledDeck();
        unshuffledDeck.fillList();
        assertThat(unshuffledDeck.isEmpty()).isFalse();
    }

    @Test
    void ckeckUnshuffledDeck() {
        UnshuffledDeck unshuffledDeck = new UnshuffledDeck();
        unshuffledDeck.fillList();
    }
}
