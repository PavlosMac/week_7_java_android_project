import card_game.*;
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;


public class DeckTest{

  Deck deck;
  Deckable fourOfSpades;
  Deckable threeOfClubs;
  Deckable fiveOfHearts;


  @Before
  public void before(){
    deck = new Deck("normal deck");
    fourOfSpades = new Card(4, SuitType.SPADES);
    threeOfClubs = new Card(3, SuitType.CLUBS);
    threeOfClubs = new Card(5, SuitType.HEARTS);
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

  



}