import java.util.Scanner;

public class Main1053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        if (num1 == 0) {
            System.out.print(1);
        } else if (num1 == 1){
            System.out.print(0);
        }
    }
}