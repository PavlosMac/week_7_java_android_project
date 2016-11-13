package card_game;
import card_game.*;
import java.util.*;


  public class Dealer implements Participant{

    Deck deck;
    String name;
    private Deckable[] hand;
    private ArrayList<Participant> players;
    

    public Dealer(String name, Deck deck){
      this.name = name;
      this.deck = deck; 
      this.hand = new Deckable[2];
      this.players = new ArrayList<Participant>();

    }

    public String getName(){
      return this.name;
    }

    public void getDeck(Deck deck){
      deck.setUpDeck();
    }

    public Deckable hasHand(){
      return this.hand[1];
    }

    public void getHand(Deckable card1, Deckable card2){
      this.hand[0] = card1;
      this.hand[1] = card2;
    }



    // public void deal(Deck deck){
    //   Deckable newCard1 = getDeck(deck).getTopCard();




    // }

  }

