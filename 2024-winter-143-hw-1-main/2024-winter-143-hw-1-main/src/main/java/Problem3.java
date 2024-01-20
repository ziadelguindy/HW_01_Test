public class Problem3 {

    // Do not change signature (function name, parameters, return type)
    public static long SumOfNonUnique(int[] data) {

        long nonUniSum = 0;
        int index; //Index for outer for loop
        int subIndex; //Index for inner for loop
        for (index = 0; index < data.length; index++)
        {
            boolean unique = true;
            for (subIndex = 0; subIndex < data.length; subIndex++)
            {
                if (index != subIndex && data[index] == data[subIndex])
                {
                    unique = false;
                    break;
                }
            }

            if (!unique)
            {
                nonUniSum = nonUniSum + data[index];
            }
        }
        System.out.println("The sum of non-uniques is " + nonUniSum);
        return nonUniSum;
    }

    /*
    TODO: Bonus Points. Add your answer here.
     */
}
