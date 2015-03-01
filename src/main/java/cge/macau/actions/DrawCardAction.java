package cge.macau.actions;

import cge.macau.Action;
import cge.macau.entities.GameState;
import cge.macau.entities.Player;
import java.util.Queue;

public class DrawCardAction implements Action {

    private final Player player;

    public DrawCardAction(Player player) {
        this.player = player;
    }

    @Override
    public void apply(GameState state, Queue<Action> actionQueue) {
        if (state.deck.isEmpty()) {
            actionQueue.offer(new ShuffleBoardAction());
            actionQueue.offer(this);
        } else {
            this.player.hand.add(state.deck.take());
        }
    }

}
