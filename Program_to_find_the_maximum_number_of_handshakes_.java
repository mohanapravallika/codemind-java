import java.util.Scanner;
import java.lang.Math;
class Mod
{
    public static void main(String args[])
    {
        int a;
        int r,c;
        int t;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        r=a-1;
        c=a*r;
        t=c/2;
        System.out.println(t);
    }
}