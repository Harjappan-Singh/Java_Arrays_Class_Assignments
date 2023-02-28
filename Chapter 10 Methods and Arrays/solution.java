import java.util.Arrays;
import java.util.Scanner;

public class solution {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        String[] names = {
                "John", "Mary", "Jane", "Tom", "James", "Brian", "Brigid", "Brendan", "Eileen", "Sarah"
        };
        int[] programming = {
                65, 67, 45, 87, 34, 87, 74, 67, 45, 67
        };
        int[] web = {
                93, 23, 76, 87, 75, 72, 54, 64, 46, 65
        };

        System.out.println("PART 1: ");
        displayData(names, programming, web);
        System.out.println();
        System.out.println();

        System.out.println("PART 2: ");
        System.out.println("Average Marks: " + Arrays.toString(getStudentAverages(programming, web)));
        System.out.println();
        System.out.println();

        System.out.println("PART 3: ");
        displayData(names, programming, web, (getStudentAverages(programming, web)));
        System.out.println();
        System.out.println();

        System.out.println("PART 4: ");
        System.out.println("Average programming marks for students is: " + calculateModuleAverage(programming));
        System.out.println("Average web marks for students is: " + calculateModuleAverage(web));
        System.out.println();
        System.out.println();

        System.out.println("PART 5 and 6: ");
        System.out.print("Enter the specified marks you want to check with: ");
        int specifiedMark = keyboard.nextInt();
        System.out.println("Number of students who got marks greater than 60: "
                + countMoreThanSpecified(programming, specifiedMark));
        System.out.println();
        System.out.println();
    }

    /**
     * 
     * 
     * Displays the students' data neatly to the screen
     * 
     * @param names       String array of student names
     * @param programming int array of programming marks
     * @param web         int array of web marks
     */

    // 1) Write a method called displayData() to display all the data neatly as a
    // table.
    public static void displayData(String[] names, int[] programming, int[] web) {
        System.out.printf("%-10s%5s%5s\n", "Name", "Prog", "Web");
        System.out.println("----------------------");
        for (int i = 0; i < names.length; i++) {
            // System.out.println(names[i] + "\t" + programming[i] + "\t" + web[i]);
            System.out.printf("%-10s%5d%5d\n", names[i], programming[i], web[i]);
        }
    }

    // 2)
    public static double[] getStudentAverages(int[] studentProgMarks, int[] studentWebMark) {
        // declare an avg array, will push the result into it
        // run a loop and initialize vats of avg and total to zero every time after
        // calculation of the results and pushing the elements
        double[] studentAvgMark = new double[studentProgMarks.length];
        for (int i = 0; i < studentWebMark.length; i++) {
            int totalMarkStudent = 0;
            double avgMarkStudent = 0.0;
            totalMarkStudent += studentProgMarks[i] + studentWebMark[i];
            avgMarkStudent = totalMarkStudent / 2.0;
            studentAvgMark[i] = avgMarkStudent;
        }
        return studentAvgMark;
    }

    // 3)
    public static void displayData(String[] names, int[] programming, int[] web, double[] avg) {
        System.out.printf("%-10s%5s%5s%7s\n", "Name", "Prog", "Web", "Avg");
        System.out.println("---------------------------");
        for (int i = 0; i < names.length; i++) {
            // System.out.println(names[i] + "\t" + programming[i] + "\t" + web[i]);
            System.out.printf("%-10s%5d%5d%8.2f\n", names[i], programming[i], web[i], avg[i]);
        }
    }

    // 4)
    public static double calculateModuleAverage(int[] module) {
        int totalModule = 0;
        for (int i = 0; i < module.length; i++) {
            totalModule += module[i];
        }
        double avgModule = 1.0 * totalModule / module.length;
        return avgModule;
    }

    // make method as useful is by letting useer inputing the values and not having
    // hardcoded values
    public static int countMoreThanSpecified(int[] module, int specifiedMark) {
        int count = 0;
        for (int i = 0; i < module.length; i++) {
            if (module[i] > specifiedMark) {
                count++;
            }
        }
        return count;
    }
}