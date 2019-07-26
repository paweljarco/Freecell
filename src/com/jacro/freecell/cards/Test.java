package com.jacro.freecell.cards;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Board board = new Board();

        for (Row r : board.getRows()) {
            System.out.println(r.toString());
            System.out.println();
        }
        for (Row r : board.getRows()) {
            System.out.println(r.isRowInOrder());
            System.out.println();
        }

    }
}
