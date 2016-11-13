import card_game.*;
import static org.junit.Assert.*;
import org.junit.*;


  public class DealerTest{

    Deck deck;
    Dealer dealer;
    Deckable card1;
    Deckable card2;

  @Before 
  public void before(){
    deck = new Deck("Pontoon deck");
    dealer = new Dealer("Linnea", deck);
    card1 = new Card(2, SuitType.HEARTS);
    card2 = new RoyalCard(RoyalType.KING, SuitType.SPADES);
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

  @Test
  public void dealHasOwnHand(){
    dealer.getHand(card1, card2);
    Deckable hand = dealer.hasHand();
    assertEquals("king of spades", hand.toString());
  }

  // @Test
  // public void playerGetsHandFromDealer(){
  //   dealer.deal();
  //   assertEquals()
  // }


//   // @Test 
//   // public void dealerCanDeal(){
//   //   dealer.dealCardsToPlayers
//   // }





}

