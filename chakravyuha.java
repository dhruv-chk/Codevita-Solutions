import java.util.*;
class chakravyuha
{
    public static void main(String args[])
    {
        int a[][]=new int[101][101];
        int x[]=new int[100];
        int y[]=new int[100];
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int i,j, k=0,l=0,count=1,n=N,m=N,power=0,p=0;
        while (k<m&&l<n)
        {
            for(i=l;i<n;i++)
            {
                a[k][i]=count; 
                if(count==1||count%11==0)
                {
                     x[p]=k;
                     y[p]=i;
                     power++;
                     p++;
                }
                count++;  
            }
            k++;
            for (i=k;i<m;i++)
            {
                a[i][n-1]=count;
                if(count==1||count%11==0)
                {
                     x[p]=i;
                     y[p]=n-1;
                     power++;
                     p++;
                }
                count++;
                
            }
            n--;
            if (k<m)
            {
                for(i=n-1;i>=l;i--)
                {
                    a[m-1][i]=count;
                    if(count==1||count%11==0)
                    {
                        x[p]=m-1;
                        y[p]=i;
                        power++;
                        p++;
                    }
                    count++;
                }
                m--;
            }
            if(l<n)
            {
                for(i=m-1;i>=k;i--)
                {
                    a[i][l]=count;
                    if(count==1||count%11==0)
                    {
                        x[p]=i;
                        y[p]=l;
                        power++;
                        p++;
                    }
                    count++;
                }
                l++;
            }
            
        }
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                System.out.print(a[i][j]+"\t");   
            }
            System.out.println();
        }
        System.out.println("Total Power points : "+power);
        for(i=0;i<p;i++)
        {
            System.out.println("("+x[i]+","+y[i]+")");
        }
    }
}