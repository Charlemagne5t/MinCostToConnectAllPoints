import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minCostConnectPointsTest1() {
        int[][] points = {
                {0, 0},
                {2, 2},
                {3, 10},
                {5, 2},
                {7, 0}
        };
        int expected = 20;
        int actual = new Solution().minCostConnectPoints(points);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minCostConnectPointsTest2() {
        int[][] points = {
                {3, 12},
                {-2, 5},
                {-4, 1}
        };
        int expected = 18;
        int actual = new Solution().minCostConnectPoints(points);
        Assert.assertEquals(expected, actual);
    }
}
