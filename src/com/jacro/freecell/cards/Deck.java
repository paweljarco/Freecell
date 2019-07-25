package com.jacro.freecell.cards;

import java.util.ArrayList;
import java.util.Collections;
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

    public void shuffle(){
        for (int i = 0; i < 10; i++) {
            Collections.shuffle(card_deck);
        }
    }

    public Card deal(){
        if (card_deck.isEmpty()) return null;
        Card card = card_deck.get(0);
        card_deck.remove(0);
        return card;

    }

    public void showCards() {
        for (Card c: card_deck){
            System.out.println(c);
        }
    }
}
