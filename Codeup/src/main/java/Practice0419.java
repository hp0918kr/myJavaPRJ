
import java.util.Arrays;
import java.util.Scanner;

public class Practice0419 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //출력할 정수를 입력받음
        int num[] = new int[5]; //입력받은 5개의 정수를 배열
        for (int i = 0; i < 5; i++) { // 5회 반복시킴
            num[i] = sc.nextInt(); //입력받은 정수를 배열에 저장
        }
        Arrays.sort(num); //Array 함수로 배열을 오름차순으로 정렬
        for (int i = num.length - 1; i >= 0; i--) { //배열을 역순으로 저장
            System.out.print(num[i]+" "); //배열을 출력
        }
    }
}
