import java.util.Scanner;

public class Main1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.printf("%d\n", num1+num2+num3);
        System.out.printf("%.1f\n", ((float)num1+num2+num3)/3);
    }
}
/*

예시
        int a=10;
        printf("%d", a<<1); //10을 2배 한 값인 20 이 출력된다.
        printf("%d", a>>1); //10을 반으로 나눈 값인 5 가 출력된다.
        printf("%d", a<<2); //10을 4배 한 값인 40 이 출력된다.
        printf("%d", a>>2); //10을 반으로 나눈 후 다시 반으로 나눈 값인 2 가 출력된다.
*/
