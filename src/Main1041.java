import java.util.Scanner;

public class Main1041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        char b = (char) ((int)a + 1);
        System.out.printf("%c" , b);
    }
}