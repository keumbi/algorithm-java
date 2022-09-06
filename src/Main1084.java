import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1084 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String data[] = br.readLine().split(" ");
        int count = 0;

        int r = Integer.parseInt(data[0]);
        int g = Integer.parseInt(data[1]);
        int b = Integer.parseInt(data[2]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < g; j++) {
                for(int k = 0; k < b; k++) {
                    bw.write(i + " " + j + " " + k + "\n");
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}

/*

Scanner 사용시 시간초과 버퍼 사용하기

import java.util.Scanner;
public class Main1084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < g; j++) {
                for(int k = 0; k < b; k++) {
                    System.out.printf("%d %d %d\n", i, j, k);
                            count++;
                }
            }
        }
        System.out.println(count);

    }
}

1084 : [기초-종합] 빛 섞어 색 만들기

빨강(red), 초록(green), 파랑(blue) 빛을 섞어
여러 가지 빛의 색을 만들어 내려고 한다.

빨강(r), 초록(g), 파랑(b) 각각의 빛의 개수가 주어질 때,
(빛의 강약에 따라 0 ~ n-1 까지 n가지의 빛 색깔을 만들 수 있다.)

주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합(r g b)과
총 가짓 수를 계산해보자.


예시
int i, j, k, c=0;
int r, g, b;
scanf("%d%d%d”, &r, &g, &b);

for(i=0; i<r; i++)
  for(j=0; j<g; j++)
    for(k=0; k<b; k++)
    {
      printf("%d %d %d\n", i, j, k);
      c++;
    }

printf("%d ", c);


*/