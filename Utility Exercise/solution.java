import java.util.Arrays;
import java.util.Random;

public class solution {
    public static void main(String[] args) {
        int[] intArr1 = { 4, 52563, 55247, 14, 6, 5714, 736, 5731, 14, 35245 };
        int[] intArr2 = { 1, 2, 3, 45, 6, 7, 8, 9, 10, 0, 0 };

        System.out.print("part 1: ");
        System.out.println(Arrays.toString(generateRandomArray(10, 5, 25)));

        System.out.println();
        System.out.print("part 2: ");
        printArray(intArr1);

        System.out.println();
        System.out.print("part 3: ");
        newArray(intArr1, 3, 6);

        System.out.println();
        System.out.print("part 4: ");
        reverseArray(intArr1);

        System.out.println();
        System.out.print("part 5: ");
        mergeArray(intArr1, intArr2);

        System.out.println();
        System.out.print("part 6: ");
        findElement(intArr2, 5);

        System.out.println();
        System.out.print("part 8: ");
        addElement(intArr2, 5, 700);

        System.out.println();
        System.out.print("part 9: ");
        removeElement(intArr2, 4);

    }

    // part 1
    public static int[] generateRandomArray(int numElement, int min, int max) {
        int[] randomArray = new int[numElement];
        Random rand = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(max - min + 1) + min;
        }
        return randomArray;
    }

    // part 2
    public static void printArray(int[] anyArray) {
        System.out.println(Arrays.toString(anyArray));
    }

    // part 3
    public static void newArray(int[] array, int x, int y) {
        int valueX = array[x];
        array[x] = array[y];
        array[y] = valueX;
        printArray(array);
    }

    // part 4
    public static void reverseArray(int[] numArray) {
        int[] reversedArray = new int[(numArray.length)];
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = numArray[(numArray.length - 1 - i)];
        }
        printArray(reversedArray);
    }

    // part 5
    public static void mergeArray(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[(firstArray.length + secondArray.length)];
        for (int i = 0; i < firstArray.length; i++) {
            mergedArray[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            mergedArray[firstArray.length + i] = secondArray[i];
        }
        printArray(mergedArray);
    }

    // part 6
    public static void findElement(int[] numArray, int element) {
        int result = Arrays.binarySearch(numArray, element);
        if (result >= 0) {
            System.out.println(result);
        } else {
            System.out.println("-1");
        }
    }

    // part 8
    public static void addElement(int[] numArray, int index, int num) {
        System.out.println("Before " + Arrays.toString(numArray));
        for (int i = index; i < numArray.length; i++) {
            if (i > index) {
                numArray[i] = numArray[i - 1];

            } else {
                numArray[i] = num;
            }
        }
        System.out.println("After " + Arrays.toString(numArray));
    }

    // part 9
    public static void removeElement(int[] numArray, int index) {
        System.out.println("Before " + Arrays.toString(numArray));
        for (int i = index; i < numArray.length; i++) {
            if (i != numArray.length - 1) {
                numArray[i] = numArray[i + 1];
            } else {
                numArray[i] = 0;
            }
        }
        System.out.println("After " + Arrays.toString(numArray));
    }
}