
/*To-Do list:
 * player1 wins game with 1 card: "2", "1"-> Player 1 wins to 0
 * player2 wins game with 1 card: "1", "2"-> Player 2 wins to 0
 * tie: "1", "1", -> "Tie"
 * player1 wins witch several cards
 * */

public class Table {

    String[] rank = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "k"};


    static String game(String player1, String player2) {
        String result = "";

        if (Integer.parseInt(player1) > Integer.parseInt(player2)) {
            result = "player1 wins";
        }
        if (Integer.parseInt(player1) < Integer.parseInt(player2)) {
            result = "player2 wins";
        }
        if (Integer.parseInt(player1) == Integer.parseInt(player2)) {
            result = "Tie";
        }

        return result;
    }

}
