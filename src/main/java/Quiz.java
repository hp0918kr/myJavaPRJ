import java.util.Scanner;
public class Quiz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.printf("입력한 값 : ");
        num = sc.nextInt();

        if((num % 2 == 0) && (num % 3 == 0))
        {System.out.printf("2의 배수와 3의 배수입니다.");}
        else if (num % 2 == 0){

            System.out.printf("2의 배수입니다.");}

        else if (num % 3 == 0){

            System.out.println("3의 배수 입니다.");}

    }
}
