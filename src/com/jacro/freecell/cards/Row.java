package com.jacro.freecell.cards;

import java.util.Stack;

public class Row {
    private Stack<Card> stack;

    public Row() {
        this.stack = new Stack<Card>();
    }

    public boolean isRowEmpty(){
        return stack.isEmpty();
    }

    public void addToRow(Card card) {
        stack.push(card);
    }

    public Card peekFromRow(){
        return stack.peek();
    }

    public Card removeFromRow() {
        return stack.pop();
    }

    public boolean isRowInOrder(){
        int test = Ranks.king.getValue();
        for (Card c : stack) {
            if (test < c.getRank().getValue()) return false;
            else test = c.getRank().getValue();
        }
        return true;
    }

    @Override
    public String toString() {
        String s = "";
        for (Card c : stack) {
            s += c.toString() + "\n";
        }
        return s;
    }
}
