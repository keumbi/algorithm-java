import java.util.Scanner;

public class Main1090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); //시작 값
        int r = scanner.nextInt(); //등비
        int n = scanner.nextInt(); //몇 번째 수 인지를 의미하는 정수(n)

        System.out.println(a * (long)(Math.pow( r, n-1)));
    }
}

/*

1090 : [기초-종합] 수 나열하기2
어떤 규칙에 따라 수를 순서대로 나열한 것을 수열이라고 한다.

예를 들어
2 6 18 54 162 486 ... 은
2부터 시작해 이전에 만든 수에 3을 곱해 다음 수를 만든 수열이다.

이러한 것을 수학에서는 앞뒤 수들의 비율이 같다고 하여
등비(비율이 같다의 한문 말) 수열이라고 한다.


등비 수열을 알게된 영일이는 갑자기 궁금해졌다.

"그럼.... 13번째 나오는 수는 뭘까?"

영일이는 프로그램을 만들어 더 큰 수도 자동으로 계산하고 싶어졌다.


시작 값(a), 등비(r), 몇 번째인지를 나타내는 정수(n)가 입력될 때
n번째 수를 출력하는 프로그램을 만들어보자.

입력
시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가
공백을 두고 입력된다.(모두 0 ~ 10)


출력
n번째 수를 출력한다.

ar^n-1
특정값의 제곱을 구하려면 java.long.Math 클래스의 pow()메소드 사용, .Math 클래스가 제공하는 메소드는 모두 정적이므로 Import나 Math클래스 선언 없이 바로 사용 가능
pow()메소드는 입력값, 출력값 모두 double형이며 Math.pow(대상숫자,지수)를 넣어주면 됩니다.
출처:https://coding-factory.tistory.com/531

1. Overview
The power of a number means how many times to use the number in multiplication. This can be easily calculated in Java.

2. Math.pow Example
Before looking at the example, let's look at the method's signature:

public double pow(double a, double b)
The method raises a to the power of b and returns the result as double. In other words, a is multiplied by itself b times.

Let's look at a simple example now:
이거다!! 이거!!
int intResult = (int) Math.pow(2, 3);
The output will be 8. Please note that the int casting in the above example is required if we want to have an Integer result.

Let's now pass a double as an argument and see the results:

double dblResult = Math.pow(4.2, 3);
The output will be 74.08800000000001.

Here we're not casting the result to an int as we are interested in a double value. Since we have a double value, we can easily configure and use a DecimalFormat to round the value to two decimal places, resulting in 74.09:

DecimalFormat df = new DecimalFormat(".00");
double dblResult = Math.pow(4.2, 3);

3. Conclusion
In this quick article, we have seen how to use the Java's Math.pow() method to calculate the power of any given base.

Like always, the full source code is available over on GitHub.(https://github.com/eugenp/tutorials/tree/master/core-java-modules/core-java-numbers-2)

출처: https://www.baeldung.com/java-math-pow

이거 때문에 IntlliJ 자동 줄바꿈 검색함 soft-wrap!!
1.코드 줄 넘버 부분에 우클릭 -> soft-wrap 활성화
2.입력창에서 shift키 두 번 연속 누르기 -> softwrap 입력 후 on off 체크 (방향키로 이동 선택 후 엔터 치면 마우스를... 사용하지 않을 수 있다.. 왜때문에.. 이러는거죠!!)
3.ctrl + alt + r -> General -> soft-wrap -> soft-wrap these file: 체크박스 활성화, 인풋필드 마지막에 ;* 추가하기 그다음 ok 버튼!! (인텐리제이 모든 파일 가로 스크롤 없애는 방법)


처음 생각 했던거
double result = Math.pow( r, n-1);
System.out.print(a * result);
소수점..ㅠㅠ
System.out.println(a * (int)(Math.pow( r, n-1)));
int... ㅠㅠ
- 총 7개 중 7번째 테스트 케이스 -
        점수 = 86 / 100

입력:
10 10 10
정답
10000000000
출력 결과
1410065408

java에서 int는 32bit, long은 64bit 사용
int는 2^5 2의 5승개, long은 2^6 2의 6승개의 공간이 필요
math.pow(2, 5) = 32.0
math.pow(2, 6) = 64.0
long이 int에 비해서 메모리를 2배 사용
int는 32bit
00000000 00000000 00000000 00000000
00000000-> 0이 8개, 8개짜리가 4개가 붙어있어서 32개

long은 64bit
8개짜리가 8개가 붙어 64개
00000000 00000000 00000000 00000000
00000000 00000000 00000000 00000000

long은 위와 같이 int에 비해서 공간이 두배로 필요함

math.pow(2, 32)
4294967296.0

math.pow(2, 64)
1.8446744073709552e+19

int는 42억 몇개이고, long은 부동소수점 표기법으로 출력 되긴 했는데

math.pow(10, 2)
100.0
math.pow(10, 19)
1e+19
10의 제곱이 100이니까 1e+19는 10의 19제곱 (1 뒤에 0이 19개 붙는다는 뜻)
억 pow(10, 8)
조 pow(10, 12)
경 pow(10, 16)
해 pow(10, 20)

-> pow(10, 19)는 1000경
개수로는 1844경개를 표현할 수 있다
숫자로는 -922경부터 +922경까지
int는 -2147483648 ~ 2147483647
long은 -9223372036854775808 ~ 9223372036854775807

출처:https://krksap.tistory.com/1448


*/