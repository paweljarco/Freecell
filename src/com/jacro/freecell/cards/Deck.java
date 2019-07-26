package com.jacro.freecell.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cardDeck;

    public Deck() {
        this.cardDeck = new ArrayList();
        for (Siuts s: Siuts.values()) {
            for (Ranks r : Ranks.values()) {
                cardDeck.add(new Card(r,s));
            }
        }
        shuffle();
    }

    public void shuffle(){
        for (int i = 0; i < 10; i++) {
            Collections.shuffle(cardDeck);
        }
    }

    public Card deal(){
        if (cardDeck.isEmpty()) return null;
        Card card = cardDeck.get(0);
        cardDeck.remove(0);
        return card;

    }

    public void showCards() {
        for (Card c: cardDeck){
            System.out.println(c);
        }
    }

    public boolean isDeckEmpty(){
        return cardDeck.isEmpty();
    }
}
