import java.util.*;
class pyramid
{
	public static void main(String[] args)
	{
	int N,h=1;
	Scanner x=new Scanner(System.in);
	N=x.nextInt();
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=N;j++) 
			{
				if((i+j)>N) 
				{
					System.out.print(hexa(h));
					System.out.print(" ");
					h=h+1;
				} 
				else 
				{
					System.out.print(" ");
				}
			}
				System.out.println();
		}
	}
	public static String hexa(int z)
	{
		int h1=2*(2*z)*(2*z)-(2*z);
		int p=h1;
		int c=0,d;
		String g;
		g=""+h1;
		while(p!=0)
		{
			d=p%10;
			c=c+1;
			p=p/10;
		}
		for(int i=1;i<(6-c);i++)
		{
			g="0"+g;
		}
		return g;
	}
}