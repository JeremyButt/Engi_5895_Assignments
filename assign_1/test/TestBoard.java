import com.zephyr.Board;
import com.zephyr.Move;
import org.junit.jupiter.api.Test;

public class TestBoard {
    @Test
    public void testString(){
        Board board = new Board();
        String stringBoard = board.toString();
        assert stringBoard.equals(" | | \n-----\n | | \n-----\n | | \n");
        System.out.print(stringBoard);
        Move move = new Move(1,1,'X');
        Board newBoard = new Board(board, move);
        assert newBoard.get(1,1) == 'X';
        String newBoardString = newBoard.toString();
        assert newBoardString.equals(" | | \n-----\n |X| \n-----\n | | \n");
        System.out.print(newBoardString);
    }

    @Test
    public void testCreate(){
        Board board = new Board();
        for (int i=0; i<3;i++) {
            for (int j = 0; j < 3; j++) {
                assert board.get(i, j) == ' ';
            }
        }
    }

    @Test
    public void testIsFull(){
        Board board = new Board();
        assert !board.isFull();
    }

    @Test
    public void testMoveConstructor(){
        Board board = new Board();
        Move move = new Move(1,1,'X');
        Board newBoard = new Board(board, move);
        assert newBoard.get(1,1) == 'X';

    }
}
