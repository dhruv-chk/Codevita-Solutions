import java.util.*;
class oil
{
    static int a[][]=new int[10][10];
    static int x,y,m,n,start,index=0;
    static int path[]=new int[100];
    public static void main(String[] args)
    {
        
        String s,r;
        String[] line;
        
        Scanner in=new Scanner(System.in);
        s=in.nextLine();
        line=s.split(",");
        x=Integer.parseInt(line[0]);
        y=Integer.parseInt(line[1]);
        System.out.println(x);
        System.out.println(y);
        
        for (int i=0;i<x;i++)
        {
            String[] line2;
            r=in.nextLine();
            line2=r.split(",");
            for(int j=0;j<y;j++)
            {   
                a[i][j]=Integer.parseInt(line2[j]);
                
            }
        }
        String line3[];
        String c=in.nextLine();
        line3=c.split(",");
        m=Integer.parseInt(line3[0]);
        n=Integer.parseInt(line3[1]);
        start=a[m][n];
        flood(m,n);        
        for (int i=0;i<path.length;i++)
        {
            System.out.print(path[i]+" ");
        }
        
    }
    public static void flood(int i,int j)
    {
        String s="";
        if(a[i-1][j]<a[i][j]&&i>=0)
        {
            System.out.println((int)a[i-1][j]);
            s=s+(int)a[i-1][j];
        }
        if(a[i+1][j]<a[i][j]&&i<x)
        {
            System.out.println((int)a[i+1][j]);
            s=s+(int)a[i+1][j];
        }
        if(a[i][j-1]<a[i][j]&&j>=0)
        {
            System.out.println((int)a[i][j-1]);
            s=s+(int)a[i][j-1];
        }
        if(a[i][j+1]<a[i][j]&&j<y)
        {
            System.out.println((int)a[i][j+1]);
            s=s+(int)a[i][j+1];
        }
        String line4[]=s.split("");
        for(int k=0;k<line4.length;k++)
        {
            if(!(s.equals("")))
            path[k]=Integer.parseInt(line4[k]);
        }
    }
    
}