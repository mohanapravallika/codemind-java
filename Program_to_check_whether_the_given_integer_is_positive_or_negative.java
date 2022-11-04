import java.util.Scanner;
import java.lang.Math;
class PositiveNegative {
    public static void main(String[] args) {

        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if (num<0)
            System.out.println("Negative Number");
        else if (num>0)
            System.out.println("Positive Number");
        else
            System.out.println("0");
    }
}