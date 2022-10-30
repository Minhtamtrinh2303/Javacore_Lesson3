import java.util.Scanner;

public class Hw7 {
    public static void main(String[] args) {
        //Viết chương trình nhập hai số nguyên n,m và in ra hình chữ nhật đặc các dấu * kích thước n*m.
        //input
        System.out.print("m = ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("n = ");
        int n = new Scanner(System.in).nextInt();
        //print
        for (int i = 1; i <= m; i++){ // print line
            for ( int j = 1; j <= n; j++ ){ // print vertical column
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
