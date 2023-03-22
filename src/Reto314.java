import java.util.Scanner;

public class Reto314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases;
        cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int num, valley = 0, peak = 0;
            num = sc.nextInt();
            int temperatures[];
            temperatures = new int[num];
            for (int j = 0; j < temperatures.length; j++) {
                temperatures[j] = sc.nextInt();
            }

            for (int j = 1; j < temperatures.length - 1; j++) {
                if (temperatures[j] > temperatures[j + 1] && temperatures[j] > temperatures[j - 1]) {
                    peak++;
                }
                if (temperatures[j] < temperatures[j + 1] && temperatures[j] < temperatures[j - 1]) {
                    valley++;
                }
            }
            System.out.println(peak + " " + valley);
        }
    }
}
