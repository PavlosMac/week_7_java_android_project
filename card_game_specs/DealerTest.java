import card_game.*;
import static org.junit.Assert.*;
import org.junit.*;


  public class DealerTest{

    Deck deck;
    Dealer dealer;
    Player player1;
    Player player2;

  @Before 
  public void before(){
    deck = new Deck("Pontoon deck");
    dealer = new Dealer("Linnea", deck);
    player1 = new Player("Pavlos");
    player2 = new Player("Lilly");
  }

  @Test
  public void dealerHasName(){
    assertEquals("Linnea", dealer.getName());
  }

  @Test
  public void dealerhasCardsInDeck(){
    dealer.makeDeck();
    assertEquals(52, deck.count());   
  }


  @Test
  public void playerGetsHandFromDealer(){
    dealer.deal();
    
  }


  // @Test 
  // public void dealerCanDeal(){
  //   dealer.dealCardsToPlayers
  // }





}

