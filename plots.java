import java.util.*;
class plots
{
	public static void main(String[] args)
	{
		String p;
		int l=0,r=0,n=0,c=0,cn,cl=0,cr=0,ct=0,cp=0;
		int[] ar=new int[1000];
		Scanner x=new Scanner(System.in);
		p=x.next();
		StringTokenizer st=new StringTokenizer(p,",");
		while(st.hasMoreTokens())
		{
			c=c+1;
			if(c==1)
				l=Integer.parseInt(st.nextToken());
			else if(c==2)
				r=Integer.parseInt(st.nextToken());
			else
				n=Integer.parseInt(st.nextToken());
		}
		cn=n;
		for(int i=l;i<=r;i++)
		{
			if(pal(i))
			{
				if(cl==0)
					cl=i;
				else if(i>cr&&cr!=0)
					cl=cr;
				if((i-cl)<=n&&(i-cl)<cn&&(i-cl)!=0&&count(cl,i)>=cp)
				{
					cr=i;
					cn=i-cl;
					cp=count(cl,i);
					ct=cl;
				}
			}
		}
		System.out.println(cp+","+ct+","+cr);
	}
	public static boolean pal(int num)
	{
		int d,t=num,r=0;
		while(t!=0)
		{
			d=t%10;
			r=r*10+d;
			t=t/10;
		}
		if(r==num)
			return true;
		else
			return false;
	}
	public static int count(int w,int z)
	{
		int co=0;
		for(int i=w;i<=z;i++)
		{
			if(pal(i))
			{
				co=co+1;
			}
		}
		return co;
	}
}