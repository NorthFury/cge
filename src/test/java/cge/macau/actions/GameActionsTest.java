package cge.macau.actions;

import cge.macau.Action;
import cge.macau.Game;
import cge.macau.entities.Card;
import cge.macau.entities.GameState;
import cge.macau.entities.Player;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

public class GameActionsTest {

    private Player player;

    private GameState state;

    private Action action;

    private Game game;

    @Before
    public void setUp() {
        state = new GameState();
        player = new Player();

        this.action = new DrawCardAction(player);
        this.game = new Game(state);
    }

    @Test
    public void testDrawCardActionWhenDeckIsEmpty() {
        state.board.put(new Card());
        state.board.put(new Card());

        game.execute(action);

        assertThat(player.hand, hasSize(1));
        assertThat(state.deck.isEmpty(), is(true));
        assertThat(state.board.size(), is(1));
    }

    @Test
    public void testDrawCardActionWhenDeckIsNotEmpty() {
        state.deck.put(new Card());

        game.execute(action);

        assertThat(player.hand, hasSize(1));
        assertThat(state.deck.isEmpty(), is(true));
    }

}
