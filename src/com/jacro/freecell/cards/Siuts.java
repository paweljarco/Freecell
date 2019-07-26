package com.jacro.freecell.cards;

public enum Siuts {
    heart("red"),
    spade("black"),
    club("black"),
    diamond("red");

    private String color;

    Siuts(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
