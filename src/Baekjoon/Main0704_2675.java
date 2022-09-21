package Baekjoon;

import java.util.Scanner;

public class Main0704_2675 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for(int i = 0; i < t; i++) {

            int r = in.nextInt();
            String s = in.next();	// nextLine() error

            for(int j = 0; j < s.length(); j++) {
                for(int k = 0; k < r; k++) {	// r 반복 출력
                    System.out.print(s.charAt(j));
                }
            }

            System.out.println();
        }

    }

}



/*

import java.util.Scanner;

public class Main2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ts = sc.nextInt();

        for (int i = 0; i < ts; i++) { // ts만큼 반복
            int repeat = sc.nextInt(); // 반복횟수 입력
            String str = sc.next(); // 문자열 입력

            // 반복횟수 * 문자열 길이만큼 곱한 크기의 char 배열 생성
            char[] chArr = new char[repeat * str.length()];
            int pos = 0;
            for (int j = 0; j < str.length(); j++) { // 문자열 길이만큼 반복
                for (int k = 0; k < repeat; k++) { // 반복횟수만큼 반복
                    chArr[pos] = str.charAt(j); // 반복횟수만큼 해당 인덱스 문자 chArr에 저장
                    pos++;
                }
            }
            System.out.println(String.valueOf(chArr)); // 문자 배열 문자열로 변환
        }
    }
}
문제
문자열 s r번 반복
p 새 문자열 출력
문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

입력
첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.
*/
