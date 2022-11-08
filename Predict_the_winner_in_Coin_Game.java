import java.util.*;
class Thor
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        int m=inp.nextInt();
        int n=inp.nextInt();
        if(m%2==1&&n%2==1)
        System.out.println("Player 2");
        else
        System.out.println("Player 1");
    }
}