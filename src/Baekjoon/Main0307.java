package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main0307 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int a;
        int b;
        StringTokenizer st;

        for(int i = 1; i<=t; i++){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            System.out.println("Case #"+i+": " + a + " + " + b + " = "+ (a+b));
        }
        br.close();
    }
}
/*
11022
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.

Scanner in = new Scanner(System.in);

		int T = in.nextInt();

		for (int i = 1; i <= T; i++) {
			int A = in.nextInt();
			int B = in.nextInt();

			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
		}

		in.close();

*/
