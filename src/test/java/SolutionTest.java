import com.pietras.Solution;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() throws Exception {
        Solution solTest = new Solution();

        assertEquals(1,solTest.solution(0));
        assertEquals(5,solTest.solution(1));
        assertEquals(13,solTest.solution(2));
        assertEquals(29,solTest.solution(3));
        assertEquals(-1,solTest.solution(19990));

    }
}
