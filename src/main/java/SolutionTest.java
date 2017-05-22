import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() throws Exception {
        Solution solTest = new Solution();

        assertEquals(5,solTest.solution(1));
        assertEquals(13,solTest.solution(2));
        assertEquals(29,solTest.solution(3));


    }
}
