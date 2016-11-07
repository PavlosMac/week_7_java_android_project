package card_game;
import card_game.*;
import java.util.*;

  public class Game{

    Player player;
    Card card;
    private ArrayList<Deckable> deck = new ArrayList<Deckable>
    Dealer dealer;
    private ArrayList<Participant> players = new ArrayList<Participant>();
    private ArrayList<Hand> hand = new ArrayList<Hand>();


    public Game(){
    this.players = players;
    this.deck = new ArrayList<Deckable>();
  }

    public int playerCount(){
      return players.size();
    }


    public void addPlayers(Player player){
      players.add(player);
    }

    public void makeDeck(Deck deck){
      deck.populateNumerals().populateRoyals().shuffle();
    }

    public void dealToPlayers(Deck deck){
       Deckable cards = game.makeDeck(deck);
        game.deal
      for ( Player player : this.players){
        player.addHand(card1, card2);
      }
    }
    




















  }