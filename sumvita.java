import java.util.*;
class sumvita
{
    public static void main(String args[])
    {
        int N,K,s=0;
        Scanner x=new Scanner(System.in);
        N=x.nextInt();
        K=x.nextInt();
        for(int i=0;i<=K; i++)
        {
            if(i==0)
            {
                s=s+1;
            }
            else if (i%2==0&&i!=0)
            {
                s=s+(fact(N)/(fact(i)*fact(N-i)));
            }
        }
        System.out.print(s);
        
    }
    public static int fact(int a)
    {
        int f=1;
        for (int i=1;i<=a;i++)
        {
            f=f*i;
        }
        return f;
    }
}