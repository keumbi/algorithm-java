import java.util.Scanner;

public class Main1097 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] a = new int[19][19];

        for(int i = 0; i < a.length; i++)  //한 줄씩 바둑판 상황 입력 받기
        {
            for (int j=0; j< a.length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int count = scanner.nextInt(); // 개수 입력받기
        for(int n=0; n<count; n++) //가로 줄 흑<->백 바꾸기
        {
            int x = scanner.nextInt()-1;
            int y = scanner.nextInt()-1;

            for (int i=0; i<a.length; i++)
                if (a[x][i] == 0)
                    a[x][i] = 1;
                else
                    a[x][i] = 0;
            for (int j=0; j<a.length; j++) {
                if (a[j][y] == 0)
                    a[j][y] = 1;
                else
                    a[j][y] = 0;
            }
        }
        //세로 줄 흑<->백 바꾸기
        for (int[] ints : a) {
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%d ", ints[j]);
            }
            System.out.println();
        }
    }
}


/*
1097 : [기초-2차원배열] 바둑알 십자 뒤집기(설명)
부모님을 기다리던 영일이는 검정/흰 색 바둑알을 바둑판에 꽉 채워 깔아 놓고 놀다가...

"십(+)자 뒤집기를 해볼까?"하고 생각했다.

바둑판(19 * 19)에 흰 돌(1) 또는 검정 돌(0)이 모두 꽉 채워져 놓여있을 때,
n개의 좌표를 입력받아 십(+)자 뒤집기한 결과를 출력하는 프로그램을 작성해보자.

참고
가로 번호, 세로 번호를 사용할 수 있는 2차원 배열을 사용하면
이러한 형태를 쉽게 기록하고 사용할 수 있다. 물론 더 확장한 n차원 배열도 만들 수 있다.


예시
int n, i, j, x, y;
int a[20][20]={};
for(i=1; i<=19; i++) //한 줄씩 바둑판 상황 입력 받기
  for(j=1; j<=19; j++)
    scanf("%d", &a[i][j]);

scanf("%d", &n); //좌표 개수 입력받기

for(i=1; i<=n; i++) //좌표의 개수만큼
{
  scanf("%d %d", &x, &y);
  for(j=1; j<=19; j++) //가로 줄 흑<->백 바꾸기
  {
    if(a[x][j]==0) a[x][j]=1;
    else a[x][j] = 0;
  }
  for(j=1; j<=19; j++) //세로 줄 흑<->백 바꾸기
  {
    if(a[j][y]==0) a[j][y]=1;
    else a[j][y] = 0;
  }
}
...
입력
바둑알이 깔려 있는 상황이 19 * 19 크기의 정수값으로 입력된다.
십자 뒤집기 횟수(n)가 입력된다.
십자 뒤집기 좌표가 횟수(n) 만큼 입력된다. 단, n은 10이하의 자연수이다.


출력
십자 뒤집기 결과를 출력한다.


*/
