import java.util.Scanner;
import java.lang.Math;
class PositiveNegative {
    public static void main(String[] args) {

        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if (num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}