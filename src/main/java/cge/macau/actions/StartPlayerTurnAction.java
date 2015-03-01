package cge.macau.actions;

import cge.macau.Action;
import cge.macau.entities.GameState;
import java.util.Queue;

class StartPlayerTurnAction implements Action {
    private final int nextPlayer;

    public StartPlayerTurnAction(int nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    @Override
    public void apply(GameState state, Queue<Action> actionQueue) {
        state.currentPlayer = this.nextPlayer;
    }

}
