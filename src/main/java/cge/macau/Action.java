package cge.macau;

import cge.macau.entities.GameState;
import java.util.Queue;

public interface Action {

    void apply(GameState state, Queue<Action> actionQueue);
}
