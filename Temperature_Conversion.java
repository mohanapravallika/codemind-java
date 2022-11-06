import java.util.Scanner;
class temp
{
    public static void main(String args[])
    {
        float F,C;
        Scanner sc=new Scanner(System.in);
        C=sc.nextFloat();
        F=((C*9)/5)+32;
        System.out.printf("%.2f",F);
    }
}