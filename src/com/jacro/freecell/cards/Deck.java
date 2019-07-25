package com.jacro.freecell.cards;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> card_deck;

    public Deck() {
        this.card_deck = new ArrayList();
        for (Siuts s: Siuts.values()) {
            for (Ranks r : Ranks.values()) {
                card_deck.add(new Card(r,s));
            }
        }
    }


}
