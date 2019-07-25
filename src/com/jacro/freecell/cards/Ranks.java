package com.jacro.freecell.cards;

public enum Ranks {
    Ace(1) ,
    two(2),
    three(3),
    four(4),
    five(5),
    six(6),
    seven(7),
    eight(8),
    nine(9),
    ten(10),
    jack(11),
    queen(12),
    king(13);

    private int num;

    Ranks(int num) {
        this.num = num;
    }

    public int getValue(){
        return num;
    }
}
