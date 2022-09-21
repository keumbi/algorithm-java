package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main0702_11720 {
    public static void main(String[] args) throws IOException {


        //1st amount of number 2nd number without space
        //total
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("");
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(arr[i]);
        }

        System.out.println(sum);


    }

}

/*
import java.util.Arrays;
import java.util.Scanner;

public class Main11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 무시
        int a = sc.nextInt();
        // 문자형으로 받음
        String str = sc.next();
        // 문자로 분리하여 문자열 배열에 저장
        String[] strArr = str.split("");

        int result = Arrays.stream(strArr)  // 스트림으로 변환 후
                .mapToInt(Integer::parseInt)    // 문자열을 정수형으로 변환
                .sum(); // 합계 출력
        System.out.println(result);
    }
}
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

출력
입력으로 주어진 숫자 N개의 합을 출력한다.
*/
