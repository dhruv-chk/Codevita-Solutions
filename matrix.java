import java.util.*;
class matrix
{
	public static void main(String[] args)
	{
		int m,n;
		String pattern;
		int[][] mat=new int[1000][1000];
		Scanner x=new Scanner(System.in);
		m=x.nextInt();
		n=x.nextInt();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat[i][j]=x.nextInt();
			}
		}
		pattern=x.next();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=1;k<pattern.length();k++)
				{
					
				}
			}
		}
	}
}