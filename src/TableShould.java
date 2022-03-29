import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TableShould {

    @Test
    void winPlayer1(){
        int player1= 2;
        int player2= 1;
        assertEquals(Table.game(player1,player2),"player1 wins" );

    }
    @Test
    void winPlayer2(){
        int player1= 1;
        int player2= 2;
        assertEquals(Table.game(player1,player2),"player2 wins" );

    }
    @Test
    void tie(){
        int player1= 1;
        int player2= 1;
        assertEquals(Table.game(player1,player2),"Tie" );

    }


}
