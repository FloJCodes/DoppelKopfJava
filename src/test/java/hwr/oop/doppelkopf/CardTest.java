package hwr.oop.doppelkopf;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

public class CardTest {

    @Test
    void testConstructorZEHN() {
        Card card = new Card(Symbol.ZEHN, Color.KARO);
        Symbol resultSymbol = card.getSymbol();
        int resultCountValue = card.getCountValue();
        int resultBattleValue = card.getBattleValue();
        Color resultColor = card.getColor();

        assertSoftly(softly->{
            softly.assertThat(resultSymbol).isEqualTo(Symbol.ZEHN);
            softly.assertThat(resultCountValue).isEqualTo(10);
            softly.assertThat(resultBattleValue).isEqualTo(2);
            softly.assertThat(resultColor).isEqualTo(Color.KARO);
        });
    }

    @Test
    void testConstructorNEUN() {
        Card card = new Card(Symbol.NEUN, Color.KARO);
        Symbol resultSymbol = card.getSymbol();
        int resultCountValue = card.getCountValue();
        int resultBattleValue = card.getBattleValue();
        Color resultColor = card.getColor();

        assertSoftly(softly->{
            softly.assertThat(resultSymbol).isEqualTo(Symbol.NEUN);
            softly.assertThat(resultCountValue).isEqualTo(0);
            softly.assertThat(resultBattleValue).isEqualTo(0);
            softly.assertThat(resultColor).isEqualTo(Color.KARO);
        });
    }
}
