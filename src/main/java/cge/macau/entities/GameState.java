package cge.macau.entities;

import java.util.ArrayList;
import java.util.List;

public class GameState {

    public CardStack deck = new CardStack();
    public CardStack board = new CardStack();

    public List<Player> players = new ArrayList<>();
    public int currentPlayer;

}
