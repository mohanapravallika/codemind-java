import java.util.Scanner;
import java.lang.Math;
class Triangle
{
    public static void main(String args[])
    {
        int a,b,c;
        double T,s;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(float)(a+b+c)/2;
        T=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",T);
    }
}