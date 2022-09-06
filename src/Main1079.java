import java.util.Scanner;

public class Main1079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            char x = scanner.next().charAt(0);
            System.out.println(x);
            if (x == 'q') break;
        }
    }
}
/*
1079 : [기초-종합] 원하는 문자가 입력될 때까지 반복 출력하기
'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
*/