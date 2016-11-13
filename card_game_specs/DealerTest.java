import card_game.*;
import static org.junit.Assert.*;
import org.junit.*;


  public class DealerTest{

    Deck deck;
    Dealer dealer;

  @Before 
  public void before(){
    deck = new Deck("Pontoon deck");
    dealer = new Dealer("Linnea", deck);
  }

  @Test
  public void dealerHasName(){
    assertEquals("Linnea", dealer.getName());
  }

  @Test
  public void dealerHasCardsInDeck(){
    dealer.getDeck(deck);
    assertEquals(52, deck.count());   
  }


//   @Test
//   public void playerGetsHandFromDealer(){
//     dealer.deal();
    
//   }


//   // @Test 
//   // public void dealerCanDeal(){
//   //   dealer.dealCardsToPlayers
//   // }





}

