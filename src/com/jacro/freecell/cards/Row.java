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

}
