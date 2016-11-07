package card_game;
import card_game.*;
import java.util.*;


public class Player implements Participant{

  private String name; 
  private Deckable[] hand = new Deckable[2];

  public Player(String name){
    this.name = name;
    
  }

  public String getName(){
    return this.name;
  }

  public Deckable getCard1(){
    return this.hand[0];
  }


  public Deckable getCard2(){
    return this.hand[1];
  }



  public void addHand(Deckable card1, Deckable card2){
    this.hand[0] = card1;
    this.hand[1] = card2;
  }


  public String canShowhand(){
    Deckable card1 = this.hand[0];
    Deckable card2 = this.hand[1];
    return card1.toString() + ", " + card2.toString();
  }

 

}

