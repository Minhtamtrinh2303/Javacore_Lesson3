import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        //Viết chương trình tìm ước số chung lớn nhất và bội số chung nhỏ nhất của hai số nguyên dương a và b.
        //nhập số nguyên dương a
        System.out.print("a = ");
        int a = new Scanner(System.in).nextInt();
        while(true){
            if (a <= 0) {
                System.out.print("a = ");
                a = new Scanner(System.in).nextInt();
            }else{
                break;
            }
        }
        //nhập số nguyên dương b
        System.out.print("b = ");
        int b = new Scanner(System.in).nextInt();
        while(true){
            if (b <= 0) {
                System.out.print("b = ");
                b = new Scanner(System.in).nextInt();
            }else{
                break;
            }
        }
        //UCLN:  greatest common divisor
        int GCD = 0;
        for (int i=1; i<=a && i<=b; i++){
            if (a%i==0 && b%i==0){
                GCD=i;
            }
        }
        System.out.println("The greatest common divisor of (a,b) is: " +GCD);
        //UBCN: least common multiple
        int LCM = (a*b)/GCD;    //UCLN=a*b/BCNN
        System.out.println("The least common multiple of (a,b) is: " +LCM);
    }
}
