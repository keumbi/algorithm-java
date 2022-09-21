package Baekjoon;

import java.util.Scanner;

public class Main0705_1157 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[26]; // 영문자의 개수는 26개임
        String s = in.next();

        for (int i = 0; i < s.length(); i++){

            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // 대문자 범위
                arr[s.charAt(i) - 'A']++;	// 해당 인덱스의 값 1 증가
            }

            else {	// 소문자 범위
                arr[s.charAt(i) - 'a']++;
            }

        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }

        System.out.print(ch);
    }
}



/*
import java.util.Scanner;

public class Main1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String al = scan.nextLine();

        al = al.toUpperCase(); // 문자열 대문자로 변환
        int max = 0; // 최대 갯수
        char maxCh= 'b'; // 최대 갯수의 문자
        for (int i = 0; i < al.length(); i++) { // 문자 길이만큼 반복
            int cnt = 0; // 문자 개수
            for (int j = i; j < al.length(); j++) { // i값 인덱스부터 문자 길이만큼 반복
                if (al.charAt(i) == al.charAt(j)) { // 문자가 같으면 cnt + 1
                    cnt++;
                }
            }
            if (cnt > max) {
                max = cnt;  // cnt가 max값보다 크면 max = cnt
                maxCh = al.charAt(i);
            }
            else if (cnt == max) maxCh = '?';
        }
        System.out.println(maxCh);

    }
}
빈도수 배열로 선언 문자열 s

https://st-lab.tistory.com/64?category=838567


문제알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*/
