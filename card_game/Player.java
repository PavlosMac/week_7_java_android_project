package card_game;
import card_game.*;
import java.util.*;


public class Player{

  private String name; 
  private Card[] hand = new Card[2];

  public Player(String name){
    this.name = name;
    
  }

  public String getName(){
    return this.name;
  }

  public Card getCard1(){
    return this.hand[0];
  }


  public Card getCard2(){
    return this.hand[1];
  }

  // public int getHandCount(){
  //   return this.hand.count();
  // }


  public void addHand(Card card1, Card card2){
    this.hand[0] = card1;
    this.hand[1] = card2;
  }


  public String canShowhand(){
    Card card1 = this.hand[0];
    Card card2 = this.hand[1];
    return card1.toString() + ", " + card2.toString();
  }

 

}

