import java.util.*;
class colour
{
	public static void main(String[] args)
	{
		String P;
		int N,count=0,cr=0,cg=0;
		Scanner x=new Scanner(System.in);
		N=x.nextInt();
		P=x.next();
		for(int i=0;i<N;i++)
		{
			if(i!=(N-1))
			{
			if(P.charAt(i)=='R')
			{
				count=count+1;
			}
			else if(P.charAt(i)=='G')
			{
				if(P.charAt(i+1)!='G')
				{
					count=count+1;
				}
			}
			}
		}
		System.out.println(count);
	}
}