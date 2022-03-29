
/*To-Do list:
 * player1 wins game with 1 card: "2", "1"-> Player 1 wins to 0
 * player2 wins game with 1 card: "1", "2"-> Player 2 wins to 0
 * tie: "1", "1", -> "Tie"
 * player1 wins witch several cards
 * */

import java.util.Collection;
import java.util.Collections;

public class Table {

    static String[] rank = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "k"};

    static String game(String player1, String player2) {
        String result = "";
        int positionPlayer1 = 0;
        int positionPlayer2 = 0;


        for (int i = 0; i < rank.length; i++) {

            if (player1 == rank[i]) {
                positionPlayer1 = i;
            }
            if (player2 == rank[i]) {
                positionPlayer2 = i;
            }
        }
        if (positionPlayer1 > positionPlayer2) {
            result = "player1 wins";
        }
        if (positionPlayer1 < positionPlayer2) {
            result = "player2 wins";
        }
        if (positionPlayer1 == positionPlayer2) {
            result = "Tie";
        }

        return result;
    }

}
