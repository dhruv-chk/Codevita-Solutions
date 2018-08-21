import java.util.*;
class tree
{	
	static int N,M;
    static char a[][]=new char[20][20];
	static int b[][]=new int[20][20];
	static int c[][]=new int[20][2];
	
	public static void main(String[] args)
	{
		int X,Y,in=0;
		Scanner x=new Scanner(System.in);
		M=x.nextInt();
		N=x.nextInt();
		X=x.nextInt();
		Y=x.nextInt();
		int a[][]=new int[M][N];
		for (int i=0;i<M;i++)
		{
			for (int j=0;j<N;j++)
			{
				a[i][j]=x.next().charAt(0);
			}
		}
		flood(X,Y,in);
		maxim();
	}
	public static void flood(int x,int y,int i)
	{
		if(x>=0&&x<=M)
		{
		if(a[x][y]=='T')
		{
			if(i==0)
			{
			i++;
			b[x][y]=i;
			c[i-1][0]=x;
			c[i-1][1]=y;
			flood(x+1,y,i);
			flood(x-1,y,i);
			flood(x,y+1,i);
			flood(x,y-1,i);
			}
			else
			{
				if((x-1)==c[i-1][0]||(x+1)==c[i-1][0]||(y-1)==c[i-1][1]||(y+1)==c[i-1][1])
				{
					i++;
					b[x][y]=i;
					c[i-1][0]=x;
					c[i-1][1]=y;
					flood(x+1,y,i);
					flood(x-1,y,i);
					flood(x,y+1,i);
					flood(x,y-1,i);
				}
			}
		}
		else
		{
			b[x][y]=-1;
		}
		}
		else
			return;
	}
	public static void maxim()
	{
		int max=0;
		for(int i=0;i<=M;i++)
		{
			for(int j=0;j<=N;j++)
			{
				if(b[i][j]>=max)
					max=b[i][j];
			}				
		}
		System.out.println(max);
	}
}