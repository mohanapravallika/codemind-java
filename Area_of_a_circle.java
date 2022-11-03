import java.util.Scanner;
import java.lang.Math;
class Circle
{
    public static void main(String args[])
    {
        int r;
        double T;
        Scanner sc = new Scanner(System.in);
        r=sc.nextInt();
        T=(float)3.14*r*r;
        System.out.format("%.2f",T);
    }
}