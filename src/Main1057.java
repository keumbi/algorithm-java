import java.util.Scanner;

public class Main1057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if ((num1==0 && num2==0)|| (num1==1 && num2==1)) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}