package dev.lpa.games;

import dev.lpa.games.poker.PokerGame;

public class GameController {

    static void main() {

        PokerGame fiveCardDraw = new PokerGame(8, 5);
        fiveCardDraw.startPlay();

    }
}
