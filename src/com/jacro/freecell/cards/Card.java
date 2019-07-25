package com.jacro.freecell.cards;

public class Card {
    private Ranks rank;
    private Siuts siut;

    public Card(Ranks rank, Siuts siut) {
        this.rank = rank;
        this.siut = siut;
    }

    public Ranks getRank() {
        return rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    public Siuts getSiut() {
        return siut;
    }

    public void setSiut(Siuts siut) {
        this.siut = siut;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", siut=" + siut +
                '}';
    }
}
