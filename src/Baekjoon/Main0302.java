package Baekjoon;
import java.util.Scanner;

public class Main0302 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        int[] arr = new int[t];

        // 두 정수 A와 B를 입력받은 다음 A+B를 출력
        //첫째 줄에 테스트 케이스의 개수 T가
        for(int i=0; i < t ; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            arr[i] = a+b;
        }
        for (int j: arr) System.out.println(j);

    }
}

/*
문제 10950 A+B - 3
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.
*/
