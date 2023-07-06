import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter;
        int howMuch = 0;
        int index = 0;
        int equalsCharCounts = 0;

        System.out.print("Kelime: ");
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            counter = 0;
            for (int j = 0; j < word.length(); j++) {
                if ((word.charAt(i) == word.charAt(j)) && (index != i)) {
                    counter++;
                }
            }
            if (counter > howMuch) {
                howMuch = counter;
                index = i;
            }
            else if (counter == howMuch) {
                equalsCharCounts = counter;
            }
        }
        if (howMuch > equalsCharCounts) {
            System.out.println(word.charAt(index) + " harfinden " + howMuch + " tane var.");
        } else {
            System.out.println("Eşitlik durumu mevcut.");
        }
    }
}