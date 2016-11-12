import card_game.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import org.mockito.*;
import static org.mockito.Mockito.*;


public class DeckTest{

  Deck deck;
  Deckable fourOfSpades;
  Deckable threeOfClubs;
  Deckable kingOfHearts;
  Dealable spyDeck;


  @Before
  public void before(){
    deck = new Deck("normal deck");
    fourOfSpades = new Card(4, SuitType.SPADES);
    threeOfClubs = new Card(3, SuitType.CLUBS);
    kingOfHearts = new RoyalCard(RoyalType.KING, SuitType.HEARTS);
    spyDeck = Mockito.spy(deck); 
  }

  @Test
  public void deckCanGetOneCard(){
    deck.addCardtoDeck(fourOfSpades);
    assertEquals(1, deck.count());
  }

  @Test
  public void cardInDeckHasName(){
    deck.addCardtoDeck(fourOfSpades);
    Deckable org = deck.getTopCard();
    assertEquals("4 of spades", org.toString());
  }


  @Test
  public void deckCanBePopulated(){
    deck.populateNumerals();
    deck.populateRoyals();
    assertEquals(52, deck.count());
  }

  // @Test
  // public void deckGivesRandomCard(){
  //   deck.setUpDeck();
  //   Deckable randomCard = deck.getTopCard();

  // }

  @Test
  public void testReturnsCard(){
  
    Mockito.when(spyDeck.setUpdeck().getTopCard()).thenReturn(Deckable card);
    assertEquals(Deckable, deck.getTopCard.class);
  }
  

}

