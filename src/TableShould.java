import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TableShould {

    @Test
    void winPlayer1(){
        String player1= "2";
        String player2= "1";
        assertEquals(Table.game(player1,player2),"player1 wins" );

    }
    @Test
    void winPlayer2(){
        String player1= "1";
        String player2= "2";
        assertEquals(Table.game(player1,player2),"player2 wins" );

    }
    @Test
    void tie(){
        String player1= "1";
        String player2= "1";
        assertEquals(Table.game(player1,player2),"Tie" );

    }

    @Test
    void winPlayer1WhitLetters(){
        String player1= "T";
        String player2= "1";
        assertEquals(Table.game(player1,player2),"player1 wins");

    }

    @Test
    void winPlayer2WhitLetters(){
        String player1= "7";
        String player2= "K";
        assertEquals(Table.game(player1,player2),"player1 wins");

    }

    @Test
    void tieWithLetters(){
        String player1= "K";
        String player2= "K";
        assertEquals(Table.game(player1,player2),"Tie" );

    }


}
