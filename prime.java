import java.util.*;
class prime
{
public static void main(String[] args)
{
	int i,s=0,flag=0,flag2=0,count=0;
	long N;
	Scanner x=new Scanner(System.in);
	N=x.nextInt();
	if(N>2)
	{
	for(i=3;i<=N;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
				flag=flag+1;
		}
		if(flag==2)
		{
			for(int k=1;k<=i;k++)
			{
				for(int l=1;l<=k;l++)
				{
					if(k%l==0)
						flag2=flag2+1;
				}
				if(flag2==2)
				{
					s=s+k;
				}
				if(s==i)
				{
					count=count+1;
					break;
				}
				flag2=0;
			}
		}
		flag=0;
		s=0;
	}
	if(count>0)
	System.out.println(count);
	}
}
}