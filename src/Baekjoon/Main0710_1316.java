package Baekjoon;

import java.util.Scanner;

public class Main0710_1316 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int count = 0;
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            if (check()) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = in.next();

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);	// i 번째 문자 저장 (현재 문자)


            // 앞선 문자와 i 번째 문자가 같지 않다면?
            if (prev != now) {

                // 해당 문자가 처음 나오는 경우 (false 인 경우)
                if (!check[now - 'a']) {
                    check[now - 'a'] = true;		// true 로 바꿔준다
                    prev = now;					// 다음 턴을 위해 prev 도 바꿔준다
                }

                // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨)
                else {
                    return false;	//함수 종료
                }
            }


            // 앞선 문자와 i 번째 문자가 같다면? (연속된 문자)
            // else 문은 없어도 됨
//            else {
//                continue;
//            }
        }
        return true;
    }
}



/*
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

출력
첫째 줄에 그룹 단어의 개수를 출력한다.

Scanner sc = new Scanner(System.in);

        /*int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        /*고정비용+가변비용*생산수<=판매가*생산수
        생산수(판매가-가변비용) = 고정비용
        생산수 = 고정비용/(판매가-가변비용)
        >> N을 기점으로 손익분기점이 바뀜

        if(b>=c) System.out.println(-1);
        else {
            System.out.println(a/(c-b)+1);
            //따라서 손익분기점이 바뀌는 시점을 출력하는 것이므로 N인 a/(c-b)+1가 되어야 함


            저는 이렇게 풀었어요
고정비용+가변비용생산수<=판매가생산수
        생산수(판매가-가변비용) = 고정비용
        생산수 = 고정비용/(판매가-가변비용)
        >> N을 기점으로 손익분기점이 바뀜

        public static void main(String[] args) throws IOException {
        /*
        노트북 n개를 생산할 때 이익이 발생하는 시점의 n == n은 총 비용과 총 수익이 같아지는 지점(이익이 발생되는 지점X)
        n * 가격(C) = 고정 비용(A) + n * 가변 비용(B)
        -> n = A / (C - B) + 1

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int A = Integer.parseInt(st.nextToken()); //고정 비용
    int B = Integer.parseInt(st.nextToken()); //가변 비용
    int C = Integer.parseInt(st.nextToken()); //가격

        if (C <= B) System.out.println("-1"); //손익분기점이 존재하지 않을 때
                else System.out.println(A/(C-B)+1);≤
                }
 */
