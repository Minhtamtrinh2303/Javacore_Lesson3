import java.util.Scanner;

public class Hw11 {
    /**Nhập số tự nhiên n rồi tính các tổng sau:
     * S = tổng các số tự nhiên không lớn hơn n.
     * S1 = tổng các số tự nhiên lẻ không lớn hơn n.
     * S2 = tổng các số tự nhiên chẵn không lớn hơn n
     */
    public static void main(String[] args) {
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
        //Calculate sum of S
        int S = 0;
        for (int i = 0; i<n; i++){
            S+=i;
        }
        System.out.println("Sum of S is: "+S);
        //Calculate sum of S1
        int S1 = 0;
        for (int i = 0; i<n; i++){
            if (i%2==1){
                S1+=i;
            }
        }
        System.out.println("Sum of S1 is: "+S1);
        //Calculate sum of S2
        int S2 = 0;
        for (int i = 0; i<n; i++){
            if (i%2==0){
                S2+=i;
            }
        }
        System.out.println("Sum of S2 is: "+S2);
    }
}
