import java.util.Scanner;

class Number {
    int m;
    int n;

    int gcd(int m, int n) {
        /*if (m == n) { return m; }
        else if (m > n) { return gcd(m - n, n); }
        else { return gcd(m, n - m); } 원래 있던거 */

        /*if (n == 0) { return m; } //나머지 연산, 재귀호출
        return gcd(n, m % n);*/

        int divTtelgeoji; //나누기떨거지
        if (n == 0) {return m;}
        while (n != 0) {
            divTtelgeoji = m % n;
            m = n;
            n = divTtelgeoji;
        }
        return m;
    }
}

public class Honework4 {
    public static void main(String[] args) {
        int gcdNum = -1;
        int m = -1;
        int n = -1;
        Scanner sc = new Scanner(System.in);
        System.out.printf("두 수를 입력하세요: ");
        m = sc.nextInt();
        n = sc.nextInt();
        Number num = new Number();
        gcdNum = num.gcd(m, n);
        System.out.printf("두 수의 최대공약수는 %d입니다.\n", gcdNum);
   }
}
