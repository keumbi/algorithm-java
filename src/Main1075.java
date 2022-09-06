import java.util.Scanner;

public class Main1075 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        while (num1 != 0) {
//            if (num1 == 0) break; 커밋 할때 인텔리제이가 항상 false라고 ...
            num1--;
            System.out.println(num1);
        }
    }
}
/*
1075 : [기초-반복실행구조] 정수 1개 입력받아 카운트다운 출력하기2(설명)
정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.

예시
int n;
scanf("%d", &n);
while(n!=0)
{
  n=n-1; //n--; 와 같다.
  printf("%d", n);
}



*/