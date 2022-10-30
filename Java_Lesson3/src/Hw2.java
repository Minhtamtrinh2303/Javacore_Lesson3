import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        //Nhập số tự nhiên n rồi liệt kê các ước số của nó. Có bao nhiêu ước số?
        //input
        System.out.print("n = ");
        int n = new Scanner(System.in).nextInt();
        int count = 0; //đếm số ước
        System.out.print("Các ước số của "+n+" là: ");
        for (int i=1; i<=n; i++) {
            if (n%i==0) {
                System.out.print(i +" ");//liệt kê các ước số của n
                count++;
            }
        }
        System.out.println(" ");
        System.out.println("Số ước của "+n+" là:" +" " +count);
    }
}
