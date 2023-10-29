import java.util.Scanner;

public class Reto444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, k;
        int[] array;
        while (true) {
            n = sc.nextInt();
            k = sc.nextInt();

            if (n == 0 && k == 0) {
                System.exit(0);
            }

            array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

            int cont = 0, backup = k, result = 0;
            boolean not_null = false;
            for (int i = 0; i < n; i++) {
                if (array[i] == 1) {
                    backup = k;
                    cont++;
                    result = cont;
                    not_null = true;
                } else {
                    if (backup > 0) {
                        cont++;
                    } else {
                        cont = 0;
                    }
                    backup--;
                }
            }

            if (!not_null) {
                result = 0;
            }
            System.out.println(result);
        }

    }
}
