public class Cards {
  enum Suit {
    CLUB, DIAMOND, SPADE, HEART
  }
  enum Value {
    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9),
    TEN(10), JACK(11), KING(12), QUEEN(13), ACE(0);
  }

  Suit cardSuit;
  Card cardValue;

    public Card(Suit suit, Value value) {
      this.value = value;
      this.suit = suit;
    }

  }
}
