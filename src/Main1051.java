import java.util.Scanner;

public class Main1051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 <= num2) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}