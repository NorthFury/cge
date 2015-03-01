package cge.macau.entities;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class CardStack {

    private Deque<Card> stack = new ArrayDeque<>();

    public void shuffle() {
        final List<Card> list = new ArrayList<>(stack);
        Collections.shuffle(list);
        stack = new ArrayDeque<>(list);
    }

    public Card take() {
        return stack.pollLast();
    }

    public List<Card> takeAll() {
        final List<Card> result = new ArrayList<>(stack);

        stack.clear();

        return result;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public void putAll(List<Card> cards) {
        stack.addAll(cards);
    }

    public void put(Card card) {
        stack.offer(card);
    }

    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
