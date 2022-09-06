import java.util.Scanner;

public class Main1074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        while (num1 != 0) {
            //if (num1 == 0) break;
            System.out.println(num1);
            num1--;
        }
    }
}
/*
1074 : [기초-반복실행구조] 정수 1개 입력받아 카운트다운 출력하기1(설명)
정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.


while(조건)
{
  ...
}
구조를 사용하자.

예시
int n;
scanf("%d", &n);
while(n!=0)
{
  printf("%d", n);
  n=n-1; //n--;와 같다.
}

*/