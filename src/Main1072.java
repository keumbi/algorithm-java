import java.util.Scanner;

public class Main1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int[] test = new int[num1];

        for(int i=0; i<num1; i++)
            test[i] = scanner.nextInt();

        for(int i=0; i<num1; i++)
            System.out.println(test[i]);
    }
}
/*
1072 : [기초-반복실행구조] 정수 입력받아 계속 출력하기(설명)
n개의 정수가 순서대로 입력된다.
-2147483648 ~ +2147483647, 단 n의 최대 개수는 알 수 없다.

n개의 입력된 정수를 순서대로 출력해보자.

while( ), for( ), do~while( ) 등의 반복문을 사용할 수 없다.


예시
  int n, m;
  scanf("%d", &n);
reget: //레이블은 콜론( : ) 으로 끝난다.
  scanf("%d", &m);
  printf("%d\n", m);
  if(n-- != 0) goto reget; //reget:으로 이동, n의 값 1만큼 감소

입력 예시 복사해 오면 에러 ㅠㅠ 입력값에서 바로 답이 노출된다..
import java.util.Scanner;

public class Main1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int arr[] = new int[num1];

        for(int i=0;i<num1;i++) {
            arr[i] = scanner.nextInt();
            System.out.println(arr[i]);
        }
    }
}
import java.util.Scanner;

public class Main1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        String num = sc.nextLine();

        System.out.println(num.replaceAll(" ", "\n"));
    }
}시영님
*/