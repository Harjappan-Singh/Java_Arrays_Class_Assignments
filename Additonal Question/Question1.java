import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        int[] nums = { 3, 8, 4, 12, 5, 7, 20, 1, 7, 9, 6 };

        int evenCount = 0;
        int totalValue = 0;
        double average = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to check: ");
        int userNum = sc.nextInt();
        int countNumsGreaterThanUserNum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                evenCount++;
            }
            totalValue += nums[i];
            if (nums[i] > userNum) {
                countNumsGreaterThanUserNum++;
            }
        }
        average = (double) totalValue / nums.length;
        System.out.println("Number of even numbers in the array" + Arrays.toString(nums) + " are: " + evenCount);
        System.out.printf("%s %s %s %.3f\n", "Average of the array", Arrays.toString(nums), " is: ", average);

        // for median value
        // get a copy of array and sort it
        // get the middle element by dividing the length by 2 and rounding it up
        int[] copyArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copyArray);
        System.out.println("The median value of the array is: " + copyArray[copyArray.length / 2]);

        System.out.println(
                "Number of number in the array greater than number entered by you is: " + countNumsGreaterThanUserNum);
    }
}