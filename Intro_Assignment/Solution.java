import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -5, 29, 9, 0 };
        System.out.print("part (i): ");
        outputArr(nums);

        System.out.print("part (ii): ");
        outputReverseArr(nums);

        System.out.print("part (iii): ");
        outputAvg(nums);

        System.out.print("part (iv): ");
        isArrayAscending(nums);

        System.out.print("part (v): ");
        outputLargestNum(nums);

        System.out.print("part (vi): ");
        outputSmallesNum(nums);

        System.out.print("part (vii): ");
        outputSmallesNumIndex(nums);

        System.out.print("part (viii): ");
        outputAvgEvenOnly(nums);

        System.out.print("part (ix): ");
        isNumberInArray(nums);

        System.out.print("part (x): ");
        outputIndexOfGivenNum(nums);

        System.out.print("part (xi): ");
        outputSortedArray(nums);

        System.out.print("part (xii): ");
        outputIndexOfEnteredNum(nums);
    }

    // i) all the elements in the array – three different ways : using your own for
    // loop, enhanced loop and a method from the Arrays class
    public static void outputArr(int[] numArray) {
        System.out.println(Arrays.toString(numArray));

        // enhanced for loop is basically for each
        // for (int num : numArray) {
        // System.out.print(num + ", ");
        // }
    }

    // ii) all the elements in the array in reverse order
    public static void outputReverseArr(int[] numArray) {
        int[] reverseArray = new int[numArray.length];
        for (int i = 0; i < numArray.length; i++) {
            reverseArray[i] = numArray[(numArray.length - 1) - i];
        }
        outputArr(reverseArray);
    }

    // iii) the average of all the values in the array.
    public static void outputAvg(int[] numArray) {
        double avg = 0;
        for (int num : numArray) {
            avg += num;
        }
        avg = avg / numArray.length;
        System.out.println("The average of the values in array is " + avg);
    }

    // iv) whether the array is in ascending order
    public static void isArrayAscending(int[] numArray) {
        // calculate the number of elements greater then adjacent element
        // if its greater than 0, array is not in ascending order
        // keep in mind you can't compare the last element so index will go out of bound
        int numNotInAscending = 0;
        for (int i = 0; i < numArray.length - 1; i++) {
            if (numArray[i] > numArray[i + 1]) {
                numNotInAscending++;
            }
        }

        if (numNotInAscending > 0) {
            System.out.println("The array is not in Ascending order.");
        } else {
            System.out.println("The array is in Ascending order.");
        }
    }

    // v) the largest number in the array
    public static void outputLargestNum(int[] numArray) {
        int largestNum = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (largestNum < numArray[i]) {
                largestNum = numArray[i];
            }
        }
        System.out.println("The largest number in the given array is: " + largestNum);
    }

    // vi) the smallest number in the array
    public static void outputSmallesNum(int[] numArray) {
        int smallesNum = 10000;
        for (int i = 0; i < numArray.length; i++) {
            if (smallesNum > numArray[i]) {
                smallesNum = numArray[i];
            }
        }
        System.out.println("The smallest number in the given array is: " + smallesNum);
    }

    // vii) the index of the smallest number in the array
    public static void outputSmallesNumIndex(int[] numArray) {
        int smallesNum = 10000000;
        int smallesNumIndex = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (smallesNum > numArray[i]) {
                smallesNum = numArray[i];
                smallesNumIndex = i;
            }
        }
        System.out.println("The index of the smallest number in the array is: " + smallesNumIndex);
    }

    // viii) the average of all the even numbers in the array
    public static void outputAvgEvenOnly(int[] numArray) {
        double avg = 0;
        int evenCount = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 == 0) {
                avg += numArray[i];
                evenCount++;
            }
        }
        System.out.println("The average of all the even numbers in the given array is: " + (avg / evenCount));
    }

    // (ix) whether a particular number, entered by the user, is in the array
    public static void isNumberInArray(int[] numArray) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int userInput = sc.nextInt();
        boolean result = false;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == userInput) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("Yea the given array contains the number " + userInput);
        } else {
            System.out.println("No the given Array doesn't contains the number " + userInput);
        }

    }

    // (x) the position (index) in the array where a particular number appears (what
    // if it’s not there?)
    public static void outputIndexOfGivenNum(int[] numArray) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number you wish to check: ");
        int userInput = sc.nextInt();
        boolean result = false;
        int indexOfNum = -1;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == userInput) {
                result = true;
                indexOfNum = i;
                break;
            }
        }
        if (result) {
            System.out.println("The index of the number " + userInput + " in the array is " + indexOfNum);
        } else {
            System.out.println("The array doesn't control the number you entered, so can't tell the index");
        }
    }

    // (xi) create an array called copyNumbers, a copy of the original array and
    // output the values from this new array in sorted order – make use of methods
    // from Arrays class
    public static void outputSortedArray(int[] numArray) {
        int[] sortedArray = Arrays.copyOf(numArray, numArray.length);
        Arrays.sort(sortedArray);
        outputArr(sortedArray);
    }

    // (xii) the position (index) in the copyNumbers array where a particular user
    // entered
    // number appears – use a method from Arrays class
    public static void outputIndexOfEnteredNum(int[] numArray) {
        int[] copyNumbers = Arrays.copyOf(numArray, numArray.length);
        Arrays.sort(copyNumbers);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check index of: ");
        int userInput = sc.nextInt();
        int index = 0;
        index = Arrays.binarySearch(copyNumbers, userInput);
        if (index >= 0) {
            System.out.println("The positon of the number " + userInput + " in the given array is " + index);
        } else {
            System.out.println("The given array doesn't contain the number you entered, so can't tell the index");
        }

    }
}