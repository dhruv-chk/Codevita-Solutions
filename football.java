import java.util.*;
class football
{
	public static void main(String[] args)
	{
		String[] Na=new String[10000];
		int match[]=new int[10000];
		int gf[]=new int[10000];
		int ga[]=new int[10000];
		int gd[]=new int[10000];
		int points[]=new int[10000];
		int index1=0,index2=0,M,S1,S2,temp;
		String T1,T2,v;
		Scanner x=new Scanner(System.in);
		System.out.println("N");
		int N=x.nextInt();
		System.out.println("Teams");
		for(int i=0;i<N;i++)
		{
			Na[i]=x.next();
		}
		for(int k=0;k<N;k++)
		{
			match[k]=0;
			ga[k]=0;
			gf[k]=0;
			points[k]=0;
		}
		System.out.println("matches");
		M=x.nextInt();
		while(M!=0)
		{
			System.out.println("t1");
			T1=x.next();
			System.out.println("t2");
			T2=x.next();
			System.out.println("s1");
			S1=x.nextInt();
			System.out.println("s2");
			S2=x.nextInt();
			for(int j=0;j<N;j++)
			{
				if(Na[j].equals(T1))
					index1=j;
				if(Na[j].equals(T2))
					index2=j;
			}
			match[index1]=match[index1]+1;
			match[index2]=match[index2]+1;
			gf[index1]=gf[index1]+S1;
			gf[index2]=gf[index2]+S2;
			ga[index1]=ga[index1]+S2;
			ga[index2]=ga[index2]+S1;
			if(S1>S2)
				points[index1]=points[index1]+2;
			else if(S2>S1)
				points[index2]=points[index2]+2;
			else
			{
				points[index1]=points[index1]+1;
				points[index2]=points[index2]+1;
			}
			for(int l=0;l<N;l++)
			{
				gd[l]=gf[l]-ga[l];
			}
		System.out.println("update");	
			for(int n=1;n<=(N-1);n++)
			{
				System.out.println("flag");
				if(points[n-1]>points[n])
				{
					System.out.println("points update");
					temp=points[n-1];
					points[n-1]=points[n];
					points[n]=temp;
					v=Na[n-1];
					Na[n-1]=Na[n];
					Na[n-1]=v;
					temp=match[n-1];
					match[n-1]=match[n];
					match[n]=temp;
					temp=gf[n-1];
					gf[n-1]=gf[n];
					gf[n]=temp;
					temp=gd[n-1];
					gd[n-1]=gd[n];
					gd[n]=temp;
					temp=ga[n-1];
					ga[n-1]=ga[n];
					ga[n]=temp;
					
				}
			}
		for(int p=1;p<N;p++)
		{
			if(points[p-1]==points[p])
			{
				if(gd[p-1]<gd[p])
				{
					System.out.println("goals update");
					temp=points[p-1];
					points[p-1]=points[p];
					points[p]=temp;
					v=Na[p-1];
					Na[p-1]=Na[p];
					Na[p-1]=v;
					temp=match[p-1];
					match[p-1]=match[p];
					match[p]=temp;
					temp=gf[p-1];
					gf[p-1]=gf[p];
					gf[p]=temp;
					temp=gd[p-1];
					gd[p-1]=gd[p];
					gd[p]=temp;
					temp=ga[p-1];
					ga[p-1]=ga[p];
					ga[p]=temp;
				}
				else if(gd[p-1]==gd[p])
				{
					if(gf[p-1]<gf[p])
				{
					temp=points[p-1];
					points[p-1]=points[p];
					points[p]=temp;
					v=Na[p-1];
					Na[p-1]=Na[p];
					Na[p-1]=v;
					temp=match[p-1];
					match[p-1]=match[p];
					match[p]=temp;
					temp=gf[p-1];
					gf[p-1]=gf[p];
					gf[p]=temp;
					temp=gd[p-1];
					gd[p-1]=gd[p];
					gd[p]=temp;
					temp=ga[p-1];
					ga[p-1]=ga[p];
					ga[p]=temp;
				}
				else if(gf[p-1]==gf[p])
				{
					if(Na[p-1].compareTo(Na[p])<0)
					{
						System.out.println("names update");
					temp=points[p-1];
					points[p-1]=points[p];
					points[p]=temp;
					v=Na[p-1];
					Na[p-1]=Na[p];
					Na[p-1]=v;
					temp=match[p-1];
					match[p-1]=match[p];
					match[p]=temp;
					temp=gf[p-1];
					gf[p-1]=gf[p];
					gf[p]=temp;
					temp=gd[p-1];
					gd[p-1]=gd[p];
					gd[p]=temp;
					temp=ga[p-1];
					ga[p-1]=ga[p];
					ga[p]=temp;
					}
						
				}
				}
			}	
		}
		M=M-1;
		}
		for(int q=0;q<N;q++)
		{
			System.out.println(Na[q]);
		}
	}
}