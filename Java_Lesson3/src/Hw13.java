import java.util.Scanner;

public class Hw13 {
    public static void main(String[] args) {
        //Nhập số tự nhiên n rồi tính tổng các số tự nhiên không lớn hơn n và chia hết cho 7.
        //input
        System.out.print("n = ");
        int n = new Scanner(System.in).nextInt();
        //isNaturalNumber
        while (true){
            if (n<=0){
                System.out.print("n = ");
                n = new Scanner(System.in).nextInt();
            }else{
                break;
            }
        }
        //calculate sum
        int S = 0;
        for (int i = 0; i<n; i++){
            if (i%7==0){
                S+=i;
            }
        }
        System.out.print("Sum = "+S);
    }
}
