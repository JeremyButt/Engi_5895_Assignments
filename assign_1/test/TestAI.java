import com.zephyr.Board;
import com.zephyr.DumbAI;
import com.zephyr.Move;
import com.zephyr.SmartAI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestAI {
    @Test
    public void testDumbAI(){
        DumbAI ai = new DumbAI(false);
        Board board = new Board();
        Move move = ai.chooseMove(board);

        int i = move.getI();
        int j = move.getJ();

        boolean iInRange = (i >= 0)&&(i <= 2);
        boolean jInRange = (j >= 0)&&(j <= 2);

        Assertions.assertTrue(iInRange, "I is not in range");
        Assertions.assertTrue(jInRange, "J is not in range");
    }
    @Test
    public void testSmartAI(){
        //Assertions.assertThrows(UnsupportedOperationException.class,() -> {SmartAI ai = new SmartAI(false);},"Not handling");
    }
}
