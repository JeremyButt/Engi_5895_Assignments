import com.zephyr.Board;
import com.zephyr.Game;
import com.zephyr.GameStatus;
import com.zephyr.Move;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestGame {
    @Test
    public void testGame(){
        Game game = new Game(true, false);
        assert(game.getBoard().isEmpty());
        Assertions.assertEquals(game.getStatus(), GameStatus.IN_PROGRESS, "Incorrect game status");
    }

    @Test
    public void testGetBoard(){
        Game game = new Game(true, false);
        game.placePlayerPiece(0,0);

        Board board = new Board();
        Move move = new Move(0,0,'X');
        board = new Board(board, move);

        Assertions.assertEquals('X', game.getBoard().get(0,0),"correct board!");
        Assertions.assertEquals(game.getBoard().toString(), board.toString(), "Board is incorrect");
    }

    @Test
    public void testGetStatus(){
        Game game = new Game(true, false);
        Assertions.assertEquals(game.getStatus(), GameStatus.IN_PROGRESS,"Incorrect game status");
    }

    @Test
    public void testPlacePlayerPiece(){
        Game game = new Game(true, false);
        boolean placedSuccessfully = game.placePlayerPiece(0,0);
        assert(placedSuccessfully);
        Assertions.assertEquals('X',game.getBoard().get(0,0),"incorrect piece");
    }

    @Disabled //remove after AI integration
    @Test
    public void testAIPlacePiece(){
        Game game = new Game(true, false);
        game.aiPlacePiece();
        assert(!game.getBoard().isEmpty() && !game.getBoard().isFull());
    }

}
