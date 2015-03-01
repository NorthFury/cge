package cge.macau.actions;

import cge.macau.Action;
import cge.macau.entities.Card;
import cge.macau.entities.GameState;
import java.util.Queue;

class ShuffleBoardAction implements Action {

    @Override
    public void apply(GameState state, Queue<Action> actionQueue) {
        Card card = state.board.take();

        state.deck.putAll(state.board.takeAll());
        state.deck.shuffle();

        state.board.put(card);
    }

}
