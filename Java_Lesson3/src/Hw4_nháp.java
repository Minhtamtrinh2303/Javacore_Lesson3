import java.util.Scanner;

public class Hw4_nháp {
    public static void main(String[] args) {
        //Viết chương trình liệt kê n số nguyên tố đầu tiên.
        //nhập n
        System.out.print("n = ");
        int n = new Scanner(System.in).nextInt();
        //System.out.println(+n+" số nguyên tố đầu tiên là: ");
        int count = 0; // đếm số số NT
        int i = 2; //tìm số nt từ chữ số 2
        while (count<n){
            if (isPrimeNumber(i)){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
    }


    public static boolean isPrimeNumber(int k) {
        if (k<2){
            return false;
        }
        for (int i=2; i<=Math.sqrt(k);i++){
            if (k%i==0){
                return false;
            }
        }
        return true;
    }
}
