import card_game.*;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;



  public class GameTest{

    Game game;
    Deck deck;
    Player player1;
    Player player2;
    Player player3;
    
  

    @Before
    public void before(){
      player1 = new Player("Linnea Lindblom");
      player2 = new Player("Pavlos Macdonald");
      player3 = new Player("Henry Kissinger");
      game = new Game();
      deck = new Deck("pontoon deck");
      }


    @Test
    public void gameCanHavePlayers(){
      game.addPlayers(player1);
      game.addPlayers(player2);
      game.addPlayers(player3);
      assertEquals(3, game.playerCount());
    }

//     // @Test
//     // public void gameCanDealToPlayers(){
//     //   game.dealToPlayers(deck);
//     //   assertNotNull(player1.hand());
//     //   assertNotNull(player2.hand());
//     // }

//     // @Test
//     // public void gameCan




}