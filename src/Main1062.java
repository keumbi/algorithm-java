import java.util.Scanner;

public class Main1062 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.printf("%d", num1 ^ num2);

    }
}
/*
입력된 정수 두 개를 비트단위로 xor 연산한 후 그 결과를 정수로 출력해보자.
비트단위(bitwise) 연산자 ^(xor, circumflex/caret, 서컴플렉스/카릿)를 사용하면 된다.

** 주의 ^은 수학식에서 거듭제곱(power)을 나타내는 기호와 모양은 같지만,
C언어에서는 전혀 다른 배타적 논리합(xor, 서로 다를 때 1)의 의미를 가진다.

** 비트단위(bitwise) 연산자는,
~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor),
<<(bitwise left shift), >>(bitwise right shift)
가 있다.

예를 들어 3과 5가 입력되었을 때를 살펴보면
3       : 00000000 00000000 00000000 00000011
5       : 00000000 00000000 00000000 00000101
3 ^ 5 : 00000000 00000000 00000000 00000110
이 된다.
이러한 비트단위 연산은 빠른 계산이 필요한 그래픽처리에서도 효과적으로 사용된다.

구체적으로 설명하자면,
두 장의 이미지가 겹쳐졌을 때 색이 서로 다른 부분만 처리할 수 있다.
배경이 되는 그림과 배경 위에서 움직이는 그림이 있을 때,
두 그림에서 차이만 골라내 배경 위에서 움직이는 그림의 색으로 바꿔주면
전체 그림을 구성하는 모든 점들의 색을 다시 계산해 입히지 않고
보다 효과적으로 그림을 처리할 수 있게 되는 것이다.
비행기 슈팅게임 등을 상상해보면 된다.
*/