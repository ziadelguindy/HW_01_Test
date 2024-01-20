/*
 * DO NOT MAKE ANY CHANGES UNLESS SPECIFIED OTHERWISE
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem3Test {

    // Okay to change the content of this function
    // DO NOT REMOVE OR CHANGE the signature
    @Test
    public void testSumOfNonUnique() {
        assertTrue(true);
        int[][] intArrays = {
            {1, 2, 3, 4, 5},
            {2, 19, 4, 8, 8},
            {4, 4, 1, 8, 9},
                {2, 19, 25, 34, 34},
                {24, 48, 24, 16, 19}



        };

        int[] expected = {0, 16, 8, 68, 48};

        //Use the static assertEquals method.
        assertEquals(expected.length, intArrays.length);

        for (int i = 0; i < intArrays.length; i++)
        {
            //Assign that to a long value for comparison.
            long actual = Problem3.SumOfNonUnique(intArrays[i]);

            for (int j = 0; j < intArrays[i].length; j++)
            {
                //Use the static assertEquals method.
                assertEquals(expected[i], (int) actual);
            }
        }
    }

    @Test
    public void largeArrayTest() {
        final int aLargeNumber = 100000;
        int[] input = new int[aLargeNumber];

        for (int i = 0; i < input.length; i++) {
            input[i] = i - aLargeNumber / 2;    // does this array have any non-unique number in it?
        }

        final int expect = 0;   // why 0?

        long startTime = System.nanoTime();

        long actual = Problem3.SumOfNonUnique(input);

        long endTime = System.nanoTime();
        long durationInNano = endTime - startTime;

        assertEquals(expect, actual);

        System.out.printf("time: %f seconds", (double) durationInNano / 1e9);

        // this test takes a bit of time to finish, ain't it?
        // try a better design in your code so this test finishes faster
        // TODO: how many seconds did your code improve between the first version and last version of your code?
    }
}
