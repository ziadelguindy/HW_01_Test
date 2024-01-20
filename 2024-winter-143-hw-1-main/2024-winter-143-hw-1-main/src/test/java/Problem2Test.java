import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    @Test
    public void testBubbleSort() {
        int[][] inputs = {
                {3, 2, 1},
                {2, 9, 4, 5},
                {7, 2, 11, 0},
                {8, 2, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
                // TODO: add more test case inputs
        };
        int[][] expects = {
                {1, 2, 3},
                {2, 4, 5, 9},
                {0, 2, 7, 11},
                {2, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
                // TODO: add more test case expected sorted results
        };

        // TODO: add a check to verify inputs and expects have the same amount of arrays
                assertEquals(inputs.length, expects.length);

        for (int i = 0; i < inputs.length; i++) {
            // TODO: add a call to your bubble sort function here
                Problem2.bubbleSort(inputs[i]);
            for (int j = 0; j < inputs[i].length; j++) {

                // this checks whether the actual result matches the expects result
                // note the use of assertArrayEquals instead of assertEquals here
                // less code == less chance of mistake
                assertArrayEquals(expects[i], inputs[i]);
            }
        }
    }
}

