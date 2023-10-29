import java.util.Scanner;

public class Reto397 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = 0, num3 = 0;
        String num2 = "";

        while (true) {
            num = sc.nextLong();

            if (num > 100000000) {
                System.exit(0);
            }

            num2 = "";

            for (int i = 1; i <= num; i++) {
                num2 = num2 + i;
            }

            num3 = Long.parseLong(num2);

            if (num3 % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
