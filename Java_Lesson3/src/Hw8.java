import java.util.Scanner;

public class Hw8 {
    public static void main(String[] args) {
        // Viết chương trình nhập hai số nguyên n,m và in ra hình chữ nhật rỗng các dấu * kích thước n*m.
        //input
        System.out.print("m = ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("n = ");
        int n = new Scanner(System.in).nextInt();
        //print
        for (int i = 1; i <= m; i++){
            for ( int j = 1; j <= n; j++ ){
                if (i == 1 || i == m || j == 1 || j == n) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
