import java.util.*;
class lastdigit
{
    public static void main(String args[])
    {
        long n;
        int i,j;
        double S=0;
        Scanner x=new Scanner(System.in);
        n=x.nextLong();
        for(i=0;Math.pow(2,i)<=n;i++)
        {
            for(j=0;j<=n;j++)
            {
                S=(int)Math.round(S+Math.pow(2,(Math.pow(2,i)+(2*j))));
            }
        }
        System.out.println(S);
        
    }
}