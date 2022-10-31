import java.util.Scanner;

public class Hw12 {
    /**
     * Nhập vào 2 số tự nhiên m và n, sao cho m < n.
     * Hãy liệt kê các số chính phương trong đoạn [m,n]. Có bao nhiêu số chính phương?
     */
    public static void main(String[] args) {
        System.out.print("m = ");               //Natural Number
        int m = new Scanner(System.in).nextInt();
        System.out.print("n = ");               //Natural Number
        int n = new Scanner(System.in).nextInt();
        //check m<n?
        while (true) {
            if (m>=n){
                System.out.print("m = ");
                m = new Scanner(System.in).nextInt();
                System.out.print("n = ");
                n = new Scanner(System.in).nextInt();
            }else{
                break;
            }
        }
        //Square Number
        int count = 0; // calculate
        System.out.print("Square Number(s) in [m,n] is(are): ");
        for (int i = m; i <= n; i++) {
            double squareNum = Math.sqrt(i) / Math.round(Math.sqrt(i));
            if (squareNum == 1){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.println("There is(are) " +count+ " square number(s).");
    }
}
