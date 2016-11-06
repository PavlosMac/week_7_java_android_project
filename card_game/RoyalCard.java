package card_game;
import card_game.*;


public class RoyalCard implements Deckable{

  private SuitType suit;
  private RoyalType royal;

  public RoyalCard( RoyalType royal, SuitType suit){
  this.suit = suit;
  this.royal = royal;
  }

}