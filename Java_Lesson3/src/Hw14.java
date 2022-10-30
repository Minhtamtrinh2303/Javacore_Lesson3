import java.util.Scanner;

public class Hw14 {
    public static void main(String[] args) {
        //Nhập số tự nhiên n rồi in ra các số chẵn nhỏ hơn n và các số lẻ nhỏ hơn n.
        //input
        System.out.print("n = ");
        int n = new Scanner(System.in).nextInt();
        //isNaturalNumber
        while (true){
            if (n<=0){
                System.out.print("n = ");
                n = new Scanner(System.in).nextInt();
            }else{
                break;
            }
        }
        //Even numbers
        System.out.print("Even numbers less than "+n+" are: ");
        for (int i = 0; i < n; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        //Odd numbers
        if (n>1){ //When n = 1, does not print "Odd numbers less than "+n+"are:"
            System.out.println("");
            System.out.print("Odd numbers less than "+n+" are: ");
        }
        for (int j = 1; j < n; j++){
            if (j%2==1){
                System.out.print(j+" ");
            }
        }
    }
}
