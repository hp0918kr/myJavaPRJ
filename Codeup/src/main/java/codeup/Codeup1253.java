import java.util.Scanner;

public class Codeup1253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 수 a와 b를 입력 받음
        System.out.print("두 수 a와 b를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // a와 b 중 작은 수와 큰 수를 결정
        int smaller = Math.min(a, b);
        int larger = Math.max(a, b);

        // 작은 수부터 큰 수까지 모든 정수 출력
        for (int i = smaller; i <= larger; i++) {
            System.out.print(i + " ");
        }
    }