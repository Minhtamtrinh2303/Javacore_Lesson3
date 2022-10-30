import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        //Viết chương trình nhập vào 4 số nguyên a, b, c và d.
        //In ra màn hình kết quả xem số nào lớn nhất trong 4 số vừa nhập.
        System.out.print("a = ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("b = ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("c = ");
        int c = new Scanner(System.in).nextInt();
        System.out.print("d = ");
        int d = new Scanner(System.in).nextInt();
        int max = Math.max(a,Math.max(b,Math.max(c,d))); //check
        System.out.println("The biggest number is: "+max);
    }
}
