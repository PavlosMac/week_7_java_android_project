package card_game;
import card_game.*;

public class FakeDeal implements Dealable{


  public Deckable getTopCard(){
    return this.cards.remove(0);
  }




}