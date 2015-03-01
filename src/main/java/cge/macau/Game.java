package cge.macau;

import cge.macau.entities.GameState;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {

    private final  GameState state;
    private final Queue<Action> actionQueue = new LinkedList<>();

    public Game(GameState state) {
        this.state = state;
    }

    private List<Action> availableMoves() {
        /*
        regular state:
            play card that matches rank or suite - one action for each card
            draw a card
        2 or 3 played:
            play a 2 or 3 card that (optional)matches the first rule)
            draw n cards
        4 played:
            can only play 4 card
            skip n turns
        A played:
            can play any card that matches selected suite or, if none selected, any suite
            draw a card
        Skip n turns effect for current player:
            skip current turn
        */
        return null;
    }

    public void execute(Action action) {
        actionQueue.add(action);
        processQueue();
    }

    private void processQueue() {
        while(!actionQueue.isEmpty()) {
            Action action = actionQueue.poll();
            action.apply(state, actionQueue);
        }
    }
}
