package card_game;
import card_game.*;
import java.util.*;


  public class Dealer implements Participant{

    Deck deck;
    String name;
    private Deckable[] hand = new Deckable[2];
    

    public Dealer(String name, Deck deck){
      this.name = name;
      this.deck = deck;  

    }

    public String getName(){
      return this.name;
    }

    public void makeDeck(){
      deck.populateNumerals();
      deck.populateRoyals();
    }

    public void shuffle(){
      deck.shuffleDeck();
    }

    public void addHand(Deckable card1, Deckable card2){
      this.hand[0] = card1;
      this.hand[1] = card2;
    }

  }

