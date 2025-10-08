import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        int space = -1;
        Scanner sc = new Scanner(System.in);

        System.out.printf("몇 개의 정수를 입력하실 예정인가요?: ");
        space = sc.nextInt();

        int[] num = new int[space];
        System.out.printf("수를 입력하세요: ");
        for (int i = 0; i <= space-1; i++) {
            num[i] = sc.nextInt();
        }
        int max = num[0];
        int min = num[0];

        for (int i = 0; i <= space-1; i++) {
            if (num[i] > max)
                max = num[i];
            if (num[i] < min)
                min = num[i];
        }
        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d\n", min);
    }
}
