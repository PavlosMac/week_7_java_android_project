package card_game;
import card_game.*;
import java.util.*;

  public class Game{

    Player player;
    Deckable card;
    Deck deck;
    private ArrayList<Player> players;
    


    public Game(){
    this.players = new ArrayList<Player>();
    this.deck = deck;
  }

    public int playerCount(){
      return players.size();
    }

   
    public void addPlayers(Player player){
      players.add(player);
    }

   
    // public void dealToPlayers(Deck deck, Participant dealer){
    //   deck.setupDeck();

    //   Deckable card1 = deal();
    //   Deckable card2 = deal();
      
    //   for ( Participant player : this.players){
    //     player.addHand(card1, card2);
    //   }

    // }
    




















  }