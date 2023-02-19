import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class gettingMoreData {
    public static void main(String[] args) throws IOException {
        File fileWithData = new File("test.txt");
        Scanner scanFile = new Scanner(fileWithData);

        int countLines = 0;
        while (scanFile.hasNext()) {
            scanFile.nextLine();
            countLines++;
        }
        System.out.println(countLines);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many records you wish to enter: ");
        int numRecords = sc.nextInt();

        String[] userFirstName = new String[(countLines + numRecords)];
        String[] userLastName = new String[(countLines + numRecords)];
        int[] agesArray = new int[(countLines + numRecords)];
        int[] nameLengthArray = new int[(countLines + numRecords)];

        File fileWithDataAgain = new File("test.txt");
        Scanner scanFileAgain = new Scanner(fileWithDataAgain);
        int i = 0;
        while (scanFileAgain.hasNext()) {
            userFirstName[i] = scanFileAgain.next();
            userLastName[i] = scanFileAgain.next();
            agesArray[i] = scanFileAgain.nextInt();
            nameLengthArray[i] = scanFileAgain.nextInt();
            i++;
        }

        for (int j = countLines; j < numRecords + countLines; j++) {
            System.out.print("Enter the first name for the student: ");
            userFirstName[j] = sc.next();
            System.out.print("Enter the last name for the student: ");
            userLastName[j] = sc.next();
            System.out.print("Enter the age for the student: ");
            agesArray[j] = sc.nextInt();
            nameLengthArray[j] = (userFirstName[j].length() + userFirstName[j].length());
        }

        Arrays.sort(userFirstName);

        System.out.println(Arrays.toString(userFirstName));
        System.out.println(Arrays.toString(userLastName));
        System.out.println(Arrays.toString(agesArray));
        System.out.println(Arrays.toString(nameLengthArray));
        // read through each line in the file
        // check how many records are there
        // initialize array with that + user inputted records
        // store each data in respective array
        // at last user sort method to sort it
        // run another for loop to print out the results in another file

        String fName = "", lName = "";
        int age = 0, nameLength = 0;
        FileWriter file = new FileWriter("new.txt", false);
        PrintWriter toFile = new PrintWriter(file);
        for (int k = 0; k < (countLines + numRecords); k++) {
            fName = userFirstName[k];
            lName = userLastName[k];
            age = agesArray[k];
            nameLength = nameLengthArray[k];
            System.out.printf("%-15s%10s%8d%8d\n", fName, lName, age, nameLength);
            // Each line should have the format: lastName ", " firstName "\t" age "\t"
            // nameLength.
            // System.out.println(lName + ", " + fName + "\t" + age + "\t" + nameLength);
            // toFile.println(lName + ", " + fName + "\t" + age + "\t" + nameLength);
            toFile.printf("%-15s%10s%8d%8d\n", fName, lName, age, nameLength);
        }
        toFile.close();

        // ask how to map data with each other
        // means when I am sorting with name, how can I get data related to each other
        // on next file
    }
}
