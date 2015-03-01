package cge.macau.actions;

import cge.macau.Action;
import cge.macau.entities.GameState;
import cge.macau.entities.Player;
import java.util.Queue;
import java.util.Random;

public class StartGameAction implements Action {

    private static final int PLAYER_CARD_COUNT = 5;

    @Override
    public void apply(GameState state, Queue<Action> actionQueue) {
        state.deck.shuffle();

        for (final Player player : state.players) {
            for (int count = 0; count < PLAYER_CARD_COUNT; ++count) {
                actionQueue.offer(new DrawCardAction(player));
            }
        }

        actionQueue.offer(new StartPlayerTurnAction(new Random().nextInt(state.players.size())));
    }

}
