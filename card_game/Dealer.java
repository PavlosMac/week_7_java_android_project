package card_game;
import card_game.*;
import java.util.*;


  public class Dealer{

    Deck deck;
    String name;
    

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

    public void deal(){
      
    }

  }

