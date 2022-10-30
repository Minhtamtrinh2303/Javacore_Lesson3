import java.util.Scanner;

public class Hw6 {
    public static void main(String[] args) {
        //Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
        //Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4=32
        //input
        System.out.print("Integer = ");
        int n = new Scanner(System.in).nextInt();
        //isIntegerPositive?
        if (n<0){
            n=-n;
        }
        //count
        int total = 0;
        while (n>0){
            total = total + n%10;
            n /= 10;
        }
        //print
        System.out.print("Sum of digits is " +total);
    }
}
/** n= 1234
 * total = 0 + 4 = 4 => 123
 * total = 4 + 3 = 7 => 12
 * total = 7 + 2 = 9 => 1
 * total = 9 + 1 = 10 => 0
 */