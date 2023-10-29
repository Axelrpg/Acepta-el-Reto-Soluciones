import java.util.Scanner;

public class Reto125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases;
        cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            String num;
            num = sc.next();
            if (num.length() % 2 == 0){
                int matriz[];
                matriz = new int[num.length()];
                for (int j = 0; j < num.length(); j++){
                    matriz[j] = Integer.parseInt(String.valueOf(num.charAt(j)));
                }

            }
        }
    }
}
