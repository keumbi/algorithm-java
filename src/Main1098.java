import java.util.Scanner;

public class Main1098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        첫 줄에 격자판의 세로(h), 가로(w) 가 공백을 두고 입력되고, 5 5
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int[][] a = new int[h][w];
//        두 번째 줄에 놓을 수 있는 막대의 개수(n)
        int n = scanner.nextInt();

//        세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력된다.
        for (int i = 1; i <= n; i++) {
            int l = scanner.nextInt();
            int d = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for (int j=0; j<l; j++) {
                if (d == 0)
                    a[x-1][y-1+j] = 1;
                else
                    a[x-1+j][y-1] = 1;
            }
        }
        for(int i=0; i<h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*

1098 : [기초-2차원배열] 설탕과자 뽑기
부모님과 함께 유원지에 놀러간 영일이는
설탕과자(설탕을 녹여 물고기 등의 모양을 만든 것) 뽑기를 보게 되었다.

길이가 다른 몇 개의 막대를 바둑판과 같은 격자판에 놓는데,

막대에 있는 설탕과자 이름 아래에 있는 번호를 뽑으면 설탕과자를 가져가는 게임이었다.
(잉어, 붕어, 용 등 여러 가지가 적혀있다.)

격자판의 세로(h), 가로(w), 막대의 개수(n), 각 막대의 길이(l),
막대를 놓는 방향(d:가로는 0, 세로는 1)과
막대를 놓는 막대의 가장 왼쪽 또는 위쪽의 위치(x, y)가 주어질 때,

격자판을 채운 막대의 모양을 출력하는 프로그램을 만들어보자.

입력
첫 줄에 격자판의 세로(h), 가로(w) 가 공백을 두고 입력되고,
두 번째 줄에 놓을 수 있는 막대의 개수(n)
세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력된다.

입력값의 정의역은 다음과 같다.

1 <= w, h <= 100
1 <= n <= 10
d = 0 or 1
1 <= x <= 100-h
1 <= y <= 100-w


출력
모든 막대를 놓은 격자판의 상태를 출력한다.
막대에 의해 가려진 경우 1, 아닌 경우 0으로 출력한다.
단, 각 숫자는 공백으로 구분하여 출력한다.

*/