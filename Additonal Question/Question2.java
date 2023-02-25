import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String[] strArray1 = new String[8];
        // int count = 0;

        // int countStringStartWith_w_or_g = 0;
        // while (count != 8) {
        // System.out.println("Please enter" + " five character string no. " + (count +
        // 1));
        // String userString = sc.next();
        // // taking only strings which are 5 character long
        // while (userString.length() != 5) {
        // System.out.println("The entered string is not five character long please
        // enter again: ");
        // userString = sc.next();
        // }
        // strArray1[count] = userString;
        // count++;
        // }
        // System.out.println(Arrays.toString(strArray1));

        // for (int i = 0; i < strArray1.length; i++) {
        // if (strArray1[i].contains("xyz"))

        // if (strArray1[i].charAt(0) == 'w' || strArray1[i].charAt(0) == 'g') {
        // countStringStartWith_w_or_g++;
        // }
        // }
        // System.out.println(countStringStartWith_w_or_g + " word(s) start with w or
        // g");

        String[] eighStrings = { "ghfry", "rtysc", "uiswe", "qwsnp", "aloxn", "nhtys", "lksdb", "zxbyj" };
        fourString(eighStrings);
    }

    public static void fourString(String[] eightStringArray) {
        String[] fourElementString = new String[4];
        int j = 0;
        for (int i = 0; i < fourElementString.length; i++) {
            fourElementString[i] = eightStringArray[j] + eightStringArray[j + 1];
            j += 2;
        }
        System.out.println(Arrays.toString(fourElementString));

        // another way is to add multiply by 2 for 1st positon and add 1 to get next
        // fourElementString[i] = eightElementString[i*2] + eightELementStrig[i*2 +1];
        // 0 ----> 0,1
        // 1 ----> 2,3
        // 2 ----> 4,5
        // 3 ----> 6,7
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character you want to search inside the array: ");
        String userEnterCharacter = sc.next();

        int countForuserChar = 0;
        for (int i = 0; i < fourElementString.length; i++) {
            for (int k = 0; k < fourElementString[i].length(); k++) {
                if (userEnterCharacter.equals(fourElementString[i].substring(k, k + 1))) {
                    countForuserChar++;
                }
            }
        }
        System.out.println(userEnterCharacter + " is of found " + countForuserChar + " times in the array.");
    }
}
