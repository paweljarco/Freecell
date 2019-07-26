package com.jacro.freecell.cards;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Board board = new Board();

        System.out.println(board.isMoveAllowed(new Card(Ranks.seven,Siuts.diamond), new Card(Ranks.eight,Siuts.spade)));
    }
}
