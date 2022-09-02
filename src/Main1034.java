import java.util.Scanner;

public class Main1034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int a = Integer.parseInt(s,8);
        System.out.printf("%d", a);
    }
}
/*     2진수, 8진수 16진수를 Scanner로 받으려면 String 데이터타입 또는 int데이터타입을 이용하면된다.

        String에서 n진수로 변환

        2진수 : Integer.valueOf(String s, 2);, return : int
        8진수 : Integer.valueOf(String s, 8);, return : int
        16진수 : Integer.valueOf(String s, 16);, return : int
        10진수에서 n진수로 변환

        2진수 : Integer.toBinaryString(int i), return : String
        8진수 : Integer.toOctalString(int i), return : String
        16진수 : Integer.toHexString(int i), return : String
        10진수를 2, 8, 16 진수로 변환하는 소스코드
        n진수에서 10진수로 변환

        2진수 : Integer.parseInt(String s, 2);, return : int
        8진수 : Integer.parseInt(String s, 8);, return : int
        16진수 : Integer.parseInt(String s, 16);, return : int
        2진수처리 비교 - 정수를 입력받아 2진수 비트연산하여 10진수로 출력하기*/
