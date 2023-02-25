import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        String[] userNames = fiveUserName();
        System.out.println(Arrays.toString(userNames));

        int[] userScores = userScores();
        System.out.println(Arrays.toString(userScores));

        for (int i = 0; i < userScores.length; i++) {
            if (userScores[i] == 7 || userScores[i] == 11) {
                // capture the index and pass it to user's array
                System.out.println(userNames[i] + " you have won the jackpot!");
            }
        }

    }

    public static String[] fiveUserName() {
        String[] fiveUserNames = new String[5];
        // ask for 5 user names
        // use scanner to get 5 user names
        // run a for loop till number is 5
        Scanner sc = new Scanner(System.in);
        String userName = "";
        for (int i = 0; i < fiveUserNames.length; i++) {
            System.out.println("Enter the user name for postion " + (i + 1));
            userName = sc.next();
            fiveUserNames[i] = userName;
        }
        return fiveUserNames;

    }

    public static int[] userScores() {
        int[] userScoreArray = new int[5];
        Random rand = new Random();
        int dice1 = 0, dice2 = 0;
        for (int i = 0; i < userScoreArray.length; i++) {
            dice1 = rand.nextInt(6) + 1;
            dice2 = rand.nextInt(6) + 1;
            userScoreArray[i] = (dice1 + dice2);
            // System.out.println(dice1 + " " + dice2);
        }
        return userScoreArray;
    }

}
