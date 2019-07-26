package com.jacro.freecell.cards;

import java.util.List;

public class Board {
    private Row[] rows;
    private Deck deck;

    public Board() {
        rows = new Row[8];
        for (int i = 0; i < 8; i++) {
            rows[i] = new Row();
        }
        deck = new Deck();
        createBoard();
    }

    private void createBoard(){
        int rowNum = 0;
        while (!deck.isDeckEmpty()) {
            rows[rowNum%8].addToRow(deck.deal());
            rowNum++;
        }
    }

    public Row[] getRows() {
        return rows;
    }

    public void setRows(Row[] rows) {
        this.rows = rows;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }
}
