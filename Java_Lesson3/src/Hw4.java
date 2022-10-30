import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        //Viết chương trình liệt kê n số nguyên tố đầu tiên.
        //input
        System.out.print("n = ");
        int n = new Scanner(System.in).nextInt(); //nhập n
        int count = 0; // đếm số số nguyên tố
        int i = 2; // tìm số nguyên tố từ chữ số 2
        System.out.print("Prime number(s) is(are): ");
        //Check
        boolean isPrimeNumber = true;
        while ( count < n ) {
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber){
                System.out.print(i+" ");
                count++;
            }
            isPrimeNumber = true;
            i++;
        }
    }
}
