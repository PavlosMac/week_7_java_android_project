import card_game.*;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;



  public class GameTest{

    Deck deck;
    Player player1;
    Player player2;
    Dealer dealer;
    Card card;
    RoyalCard royalCard;

    @Before
    public void before(){
      game = new Game();
      deck = new Deck("pontoon deck");
      player1 = new Player("Linnea");
      player2 = new Player("Pavlos");
      dealer = new Dealer("Jack", deck);
    }


    @Test
    public void gameCanHavePlayers(){
      game.addPlayers(player1);
      game.addPlayers(player2);
      assertEquals(2, game.players.count());
    }





}