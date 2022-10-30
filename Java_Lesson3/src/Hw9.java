import java.util.Scanner;

public class Hw9 {
    public static void main(String[] args) {
        //Viết chương trình nhập số nguyên h và in ra màn hình tam giác vuông cân đặc có độ cao h.
        //input
        System.out.print("height = ");
        int h = new Scanner(System.in).nextInt();
        for (int i = 1; i <=h; i++){ // print line
            for (int j = 1; j<=i; j++){ // print vertical column
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}

