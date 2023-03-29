public class Quiz_03 {
    public static void main(String[] args){
        int i, k;

        for (i = 2; i < 10; i++) {
            for (k = 1; k < 10; k++) {
                System.out.printf("%3d X %d = %d", i, k, i * k);
            }
            System.out.printf("\n");
        }
    }
}
