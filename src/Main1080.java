import java.util.Scanner;

public class Main1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int till = scanner.nextInt();
        int num = 0;
        int sum = 0;

        do {
            num += 1;
            sum += num;
        } while (sum < till);
        System.out.println(num);

        /* Conditional break inside infinite loop 라고 인텔리제이가 고쳐줬다 신기방기
        while (true) {
            num += 1;
            sum += num;
            if (sum >= till) break;
        }
        System.out.println(num);*/
    }
}
/*
1080 : [기초-종합] 언제까지 더해야 할까?
1, 2, 3 ... 을 계속 더해 나갈 때,
그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지
계속 더하는 프로그램을 작성해보자.

즉, 1부터 n까지 정수를 계속 더한다고 할 때,
어디까지 더해야 입력한 수보다 같거나 커지는지 알아보고자 하는 문제이다.
*/