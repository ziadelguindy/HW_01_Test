/**
 * This class is designed to do a binary search on an integer array
 * for a specified value in that array.
 * @author Peng Du, completed by Ziad El-Guindy
 * @version 1.0
 */
public class Problem1 {

    // Do not change signature (function name, parameter variable type and return type)
    public static int binarySearch(int[] data, int target) {

        int firstElement = 0; //The first element of an array is always zero.
        int lastElement = data.length - 1; //Varies by array length.
        int midpoint; //This will change for every iteration of the binary search.

        int output = 0; //Always initialize variables
        boolean isFound = false; //Always assume the target value has not been found.

        while ((firstElement <= lastElement) && !(isFound)) //The reason why there is an AND
            //operator is: if you have already found the integer you are looking for, why search again?
        {
            midpoint = (firstElement + lastElement) / 2; //Using integer division.

            if (target == data[midpoint]) //If the target element equals the value at the midpoint in the
                //data integer array, set isFound to true and set the output to the midpoint.
            {
                isFound = true;
                output = midpoint;
            }

            else if (target > data[midpoint])
            {
                firstElement = midpoint + 1;
            }

            else if (target < data[midpoint])
            {
                lastElement = midpoint - 1;
            }
        }

        if (firstElement > lastElement) //if the first element is greater than the last (not found case)
        {
            //System.out.println("Element not found.");
            return -1;
        }

        //System.out.println("Element found at index: " + output); /* Print on the screen where the target
        //number has been found. */
        return output; //return the result after the binary search.

        // Placeholder.
    }

    //First, I tested my binary search algorithm by debugging it several times on paper.
    //All those tests have passed.

    //Then, I discovered how the assertEquals method in the testing harness for this problem
    //I discovered that if my code generates an error, the assertEquals will terminate the program
    //complaining that I have a wrong answer.




}

