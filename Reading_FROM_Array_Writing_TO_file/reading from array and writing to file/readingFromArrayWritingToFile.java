import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class readingFromArrayWritingToFile {
    public static void main(String[] args) throws IOException {
        String[] firstName = { "Harjappan", "mac", "noah", "sean", "rory", "liam", "katie", "jamie", "maggie",
                "meghan" };
        String[] lastName = { "Singh", "Machua", "Krobot", "Mooney", "Ogorgman", "Kento", "Lynch", "Lawlor", "Rathnam",
                "Keightley" };
        int[] ages = { 19, 20, 25, 27, 50, 29, 14, 20, 46, 100 };

        // populating nameLengths
        int[] nameLengths = new int[firstName.length];
        for (int i = 0; i < firstName.length; i++) {
            nameLengths[i] = (firstName[i].length() + lastName[i].length());
        }
        System.out.println(Arrays.toString(nameLengths));

        FileWriter file = new FileWriter("test.txt", false);
        PrintWriter toFile = new PrintWriter(file);

        String fName = "", lName = "";
        int age = 0, nameLength = 0;

        for (int i = 0; i < 10; i++) {
            fName = firstName[i];
            lName = lastName[i];
            age = ages[i];
            nameLength = nameLengths[i];
            System.out.printf("%-15s%10s%8d%8d\n", fName, lName, age, nameLength);
            // Each line should have the format: lastName ", " firstName "\t" age "\t"
            // nameLength.
            // System.out.println(lName + ", " + fName + "\t" + age + "\t" + nameLength);
            // toFile.println(lName + ", " + fName + "\t" + age + "\t" + nameLength);
            toFile.printf("%-15s%10s%8d%8d\n", fName, lName, age, nameLength);
        }
        toFile.close();
    }
}