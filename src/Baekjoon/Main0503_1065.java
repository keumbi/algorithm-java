package Baekjoon;

//import java.util.Arrays;
import java.util.Scanner;

public class Main0503_1065 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print(chkNum(in.nextInt()));
        in.close();
    }

    public static int chkNum(int num) {
        int count; // 카운팅

        if (num < 100) {
            return num;
        }

        else {
            count = 99;

            for (int i = 100; i <= num; i++) {
                int hun = i / 100; // 백
                int ten = (i / 10) % 10; // 십
                int one = i % 10;

                if ((hun - ten) == (ten - one)) { // 각 자릿수
                    count++;
                }
            }
        }

        return count;
    }
}

/*
import java.util.Scanner;

public class Main0503_1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //숫자 N입력
		int count = 0; //한수 개수 카운팅
		for (int i = 1; i <= num; i++) { //입력 범위가 1이상이므로 1부터 시작.
			if (i <= 99) { //1~99까지는 모두 한수이므로 무조건 +1
				count += 1;
			} else if (i <= 999) { //100부터는 조건을 확인해서 한수 조건을 충족하면 +1
				String[] num_str = Integer.toString(i).split(""); //각 자리수를 자정할 문자열 배열 생성.
				if ((Integer.parseInt(num_str[1]) - Integer.parseInt(num_str[0])) == (Integer.parseInt(num_str[2])- Integer.parseInt(num_str[1]))) { //백의자리 십의자리 일의자리를 각각 a, b, c라고 생각하고 b-a == c-b 이면 한수이므로 +1
					count += 1;
				}
			}
		}
		System.out.println(count);
	}
}
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
*/
