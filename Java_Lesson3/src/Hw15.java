import java.util.Scanner;

public class Hw15 {
    public static void main(String[] args) {
        //Nhập 2 số tự nhiên m,n rồi kiểm tra xem chúng có nguyên tố cùng nhau không.
        //Hai số nguyên tố cùng nhau là 2 số có UCLN là 1.
        //input
        System.out.print("m = ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("n = ");
        int n = new Scanner(System.in).nextInt();
        //isCoprimeNumber?
        for (int i = 2; i<=m; i++){
            if ( m%i == 0 && n%i == 0){
                System.out.println(m+" and "+n+" are not coprime numbers.");
                return;
            }
        }
        System.out.println(m+" and "+n+" are not coprime numbers.");
        System.out.println("");
    }
}
