import java.util.Scanner;

public class Reto300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases;

        cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            String word;
            word = sc.next();
            word.toLowerCase();

            boolean letter_a = false, letter_e = false, letter_i = false, letter_o = false, letter_u = false;

            if (word.contains("a")) {
                letter_a = true;
            }
            if (word.contains("e")) {
                letter_e = true;
            }
            if (word.contains("i")) {
                letter_i = true;
            }
            if (word.contains("o")) {
                letter_o = true;
            }
            if (word.contains("u")) {
                letter_u = true;
            }

            if (letter_a && letter_e && letter_i && letter_o && letter_u) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}