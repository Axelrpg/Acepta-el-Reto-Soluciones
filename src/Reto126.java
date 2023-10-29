import java.util.Scanner;

public class Reto126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[];
        num = new int[2];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        if (factorial(num[1]) % num[0] == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static int factorial(int num) {
        if (num == 0)
            return 1;
        else
            return num * factorial(num - 1);
    }
}
