package Baekjoon;
import java.util.Scanner;

public class Main0207 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        // 만약 모든 변수가 다른 경우
        if (a != b && b != c && a != c) {
            int max;
            // 만약 a > b 라면
            if (a > b) {
                // c > a > b 라면
                // a > (b, c)
                max = Math.max(c, a);
            }
            // b > a 라면
            else {
                // c > b > a 라면
                // b > (a, c)
                max = Math.max(c, b);
            }
            System.out.println(max * 100);
        }
        // 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
        else {
            // 3개의 변수가 모두 같은 경우
            if (a == b && a == c) {
                System.out.println(10000 + a * 1000);
            }
            else {
                // a가 b혹은 c랑만 같은 경우
                if(a == b || a == c) {
                    System.out.println(1000 + a * 100);
                }
                // b가 c랑 같은 경우
                else {
                    System.out.println(1000 + b * 100);
                }
            }
        }

    }
}

/*1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
public class No7B4_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(a, b, c));
        int reward=0;

        switch (set.size()) {
            case 1:
                reward = 10000 + 1000 * a;
                break;
            case 2:
                if (a == b || a == c) {
                    reward = 1000 + 100 * a;
                } else {
                    reward = 1000 + 100 * b;
                }
                break;
            case 3:
                reward = set.last() * 100;
        }
        System.out.println(reward);
    }
}


같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오
ublic class Main10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a + b;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
어렵게 가기

int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i=1; i<10; i++) System.out.println(N + " * " + i + " = " + N*i);



import java.io.*;

public class Main15552{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for(int i = 0; i < n; i++){
            String s = bf.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            bw.write(a+b+"\n");
        }
        bw.flush();
    }
}


import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int arr[] = new int[c];

        for(int i=0; i<c; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[i] = a+b;
            int num = i+1;

            System.out.println("Case #" + num + ": " + arr[i]);
        }
    }
}



System.out.println("Case #" + i + ": "
                    +(Integer.parseInt(st.nextToken())
                    +Integer.parseInt(st.nextToken())));



 2438
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++){
            System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public class No8B5_2438 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        String s = "";

        for (int i = 0; i < n; i++) {
            s += "*";
            bw.write(s + "\n");
        }

        bw.flush();
    }
}

2439-
public class No9B4_2439 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            String s = "";
            for (int j = 1; j <= n - i; j++) {
                s += " ";
            }
            for (int j = 1; j <= i; j++) {
                s += "*";
            }
            bw.write(s + "\n");
        }


        bw.flush();
    }
}

public class No11B5_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        do {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.print((a + b != 0) ? a + b + "\n" : "");
        } while (a + b != 0);

    }
}
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a==0 && b==0) {
                sc.close();
                break;
            }

            System.out.println(a+b);

        }
    }
public class No12B5_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;

        while ((input = br.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(input);
            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            bw.write(a + b + "\n");
        }
        bw.flush();
    }
}
jh
while ((str = br.readLine()) != null) {
            int A = str.charAt(0) -48; //charAt() 은 해당 문자의 아스키코드 값을 반환함
            int B = str.charAt(2) -48; //정수형태로 변경하려면 -48 혹은 -'0' 를 해야함
            sb.append(A+B).append('\n');
        }



        1110---------------------------------
jh
int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int copy = N;

        do {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cnt++;
        }
        while (copy != N);

        System.out.println(cnt);

        4,5,6

*/
