import card_game.*;
import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest{

  Player player;
  Card card1;
  Card card2;

  @Before
  public void before(){

    player = new Player("Pavlos");
    card1 = new Card(3, SuitType.SPADES);
    card2 = new Card(2, SuitType.DIAMONDS);

  }


  @Test 
  public void getName(){
    assertEquals("Pavlos", player.getName());
  }


  @Test
  public void playerCanGetHand(){
    player.addHand(card1,card2);
    Card card = player.getCard1();
    assertEquals("3 of spades", card.toString());
  }


  @Test 
  public void playerCanShowHand(){
    player.addHand(card1,card2);
    assertEquals("3 of spades, 2 of diamonds", player.canShowhand());
  }



}