package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main0703_10809 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        String s = in.nextLine();
        for(int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);


            if (arr[chr - 'a'] == -1){
                arr[chr - 'a'] = i;
            }
        }


        for (int value : arr) {
            System.out.print(value + " ");
        }



    }

}

/*

import java.util.Scanner;

public class Main10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 단어 입력
        String keyword = scan.nextLine();
        // char a 선언
        char a = 'a';
        // 알파벳 개수만큼 반복
        for (int i = 0; i < 26; i++) {
            String str = String.valueOf(a); // 문자를 문자열로 변환
            if (keyword.contains(str)) { // keyword에 str과 동일한 문자가 있으면
                System.out.print(keyword.indexOf(str) + " "); // str의 index값 출력
            } else System.out.print(-1 + " "); // 동일한 문자가 없으면 -1 출력
            a++; // 반복할때마다 다음 알파벳
        }
    }
}
소문자 알파벳
a-z 출력 처음 나오는 위치 출력
위치는 0
알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

출력
각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
*/
