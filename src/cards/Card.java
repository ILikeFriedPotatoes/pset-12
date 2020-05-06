package cards;

public class Card implements Comparable<Card> {
//  enum Suit {
//    CLUB, DIAMOND, SPADE, HEART
//  }
//  
//  enum Value {
//    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), KING(12), QUEEN(13), ACE(0);
//  }

//  Suit cardSuit;
//  Card cardValue;
	
	private String suit;
	private String value;

  public Card(String suit, String value) {
    this.value = value;
    this.suit = suit;
  }

	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
