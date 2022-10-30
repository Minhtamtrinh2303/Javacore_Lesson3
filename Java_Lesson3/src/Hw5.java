import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {
        //Một số được gọi là số thuận nghịch nếu ta đọc từ trái sang phải hay từ phải sang trái số đó ta vẫn nhận được một số giống nhau.
        //Hãy nhập một số và kiểm tra xem số đó có phải số thuật nghịch hay không (ví dụ số: 558855).
        //input
        System.out.print("Original number = ");
        int n = new Scanner(System.in).nextInt();
        //isReversibleNumber?
        int orginalNum = n;
        int reversibleNum = 0;
        while ( n > 0 ){
            reversibleNum = reversibleNum * 10 + n % 10;
            n /= 10;
        }
        //conclusion and print
        if (reversibleNum == orginalNum ){
            System.out.println("is a reversible number");
        }else{
            System.out.println("is not a reversible number");
        }
    }
}
