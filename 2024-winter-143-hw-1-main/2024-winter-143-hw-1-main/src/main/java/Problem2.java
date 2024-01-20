public class Problem2 {

    // Do not change signature (function name, parameters, return type)
    public static void bubbleSort(int[] data) {
        // TODO: Add your solution
        int numComp = 0; //Number of comparisons.
        for (int i = 0; i < data.length - 1; i++) {
            numComp++;
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1])
                {
                    int tempStor = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tempStor;
                }
            }
        }
        System.out.println("The array has been sorted after " + numComp + " comparisons.");
        System.out.println("The sorted array is: ");
        System.out.print("{");
        for (int k = 0; k < data.length; k++)
        {
            if (k == data.length - 1)
            {
                System.out.print(data[k]);
            }
            else {
                System.out.print(data[k] + ", ");
            }
        }
        System.out.println("} \n");
    }
    // TODO: answers "how many times of comparison for an array of size n?"
}
