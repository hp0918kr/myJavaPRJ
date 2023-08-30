import java.util.Scanner;

public class Codeup1254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시작 알파벳과 마지막 알파벳을 입력하세요 (소문자, 사전순): ");
        String input = sc.nextLine();

        if (isValidInput(input)) {
            char sChar = input.charAt(0);
            char eChar = input.charAt(2);

            while (sChar <= eChar) {
                System.out.print(sChar + " ");
                sChar++;
            }
            System.out.println();
        } else {
            System.out.println("올바른 입력 형식이 아닙니다.");
        }

        sc.close();
    }

    public static boolean isValidInput(String input) {
        return input.matches("[a-z] [a-z]");
    }