import java.util.Scanner;

public class Hw10 {
    public static void main(String[] args) {
        //Viết chương trình nhập số nguyên h và in ra màn hình tam giác cân có độ cao h.
        //input
        System.out.print("height = ");
        int height = new Scanner(System.in).nextInt();
        //print
        for (int line = 1;line <= height; line++){
            for (int i = 1; i <= (height-line);i++){//print space
                System.out.print("  ");
            }
            for (int j = 1; j <= (2*line-1); j++){//print *
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
/** line =              space + "*"        height=4
 *  1          *            3 + 1         height-dòng 1 = 3
 *  2        * * *          2 + 3         height-dòng 2 = 2
 *  3      * * * * *        1 + 5
 *  4    * * * * * * *      0 + 7
 *  space=height-line
 *  "*"=2*line-1
 */