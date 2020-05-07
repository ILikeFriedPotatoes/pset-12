package game;

import cards.Card;
import java.util.Scanner;

public class Launch {
  public static void main(String args[]) {
    System.out.println("Hello, what game would you like to play?");
    System.out.println("1) Blackjack");
    System.out.println("2) Poker");

    Scanner in = new Scanner(System.in);
    String game = in.nextLine();

    Blackjack b = new Blackjack();
    Poker p = new Poker();
    
    switch(game) {
      case 1: b.startBlackjack();
      case 2: p.startPoker();
    }


  }
}
