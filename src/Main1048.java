import java.util.Scanner;

public class Main1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.printf("%d", num1<<num2);
    }
}