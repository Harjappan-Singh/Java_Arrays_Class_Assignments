import java.util.Arrays;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] filmNames = { "MIA", "Trainspotting", "Brooklyn", "MI", "Goodfellas", "Barry Lyndon", "Fight Club",
                "Parasite" };
        int[] releaseYear = { 1972, 1984, 2015, 1994, 1990, 1975, 1999, 2019 };
        int[] duration = { 175, 93, 117, 154, 146, 185, 139, 132 };
        listFilms(filmNames, releaseYear, duration);

        String[] directorNames = { "Veronica", "Danny Boyle", "John Crowley", "Brian de Palma", "Martin Scorese",
                "Stanley Kubrick", "David Fincher", "Bong Joon Ho" };

        // part A
        listFilms(filmNames, releaseYear, duration, directorNames);

        // part B
        // added this code after exam
        int beginningDecade = 0;
        System.out.print("Enter the beginning of the decade: ");
        beginningDecade = keyboard.nextInt();
        while (beginningDecade % 10 != 0) {
            System.out.print("You didn't enter the beginning year correctly (it should be like 1980, 2000): ");
            beginningDecade = keyboard.nextInt();
        }
        // end of code added after exam

        int numFilReleaseInDecade = filmReleaseInDecade(filmNames, releaseYear, beginningDecade);
        System.out.println("Number of films released are: " + numFilReleaseInDecade);

        // part C
        boolean isThereFilm = isDurationLonger(filmNames, duration);
        if (isThereFilm) {
            System.out.println("Yea there are films having duration greater than specified duration");
        } else {
            System.out.println("No there are no films with specified duration");
        }

    }

    public static void listFilms(String[] filmNames, int[] releaseYear, int[] duration) {
        System.out.printf("%-34s%10s%20s\n", "Film Name", "Release Year", "Duration (mins)");
        for (int i = 0; i < duration.length; i++) {
            System.out.printf("%-34s%5d%20d\n", filmNames[i], releaseYear[i], duration[i]);
        }
    }

    // part A
    // just add another parameter and add it inside print statement also
    public static void listFilms(String[] filmNames, int[] releaseYear, int[] duration, String[] directorName) {
        System.out.printf("%-34s%10s%20s%25s\n", "Film Name", "Release Year", "Duration (mins)", "Director Name");
        for (int i = 0; i < duration.length; i++) {
            System.out.printf("%-34s%5d%20d%30s\n", filmNames[i], releaseYear[i], duration[i], directorName[i]);
        }
    }

    // part B
    // expected is user enter the decade starting inside decade
    // comparing each film decade with that decade starting and ending
    // having a counter to keep track of the films
    public static int filmReleaseInDecade(String[] filmNames, int[] releaseYear, int decade) {
        int numFilms = 0;
        int decadeStarting = decade;
        int decadeEnding = decadeStarting + 9;
        for (int i = 0; i < filmNames.length; i++) {
            if (releaseYear[i] >= decadeStarting && releaseYear[i] <= decadeEnding) {
                numFilms++;
            }
        }
        return numFilms;
    }

    // part c
    // get input from user
    // compare it with duration
    // if there is store it inside an array
    // print those films
    public static boolean isDurationLonger(String[] filmNames, int[] duration) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the duration you wish to check: ");
        int userDuration = sc.nextInt();
        boolean isFilm = false;
        for (int i = 0; i < filmNames.length; i++) {
            if (duration[i] > userDuration) {
                isFilm = true;
            }
        }
        return isFilm;
    }
}