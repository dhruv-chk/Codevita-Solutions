import java.io.*;
import java.util.*;
class alpha
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s,s1,tem1;
		String[] ar1=new String[100];
		int[] ar2=new int[100];
		int N,t,t1=0,t2=0,j,k,tem2;
		N=Integer.parseInt(br.readLine());
		for(int i=1;i<=N;i++)
		{
			s=br.readLine();
			StringTokenizer st=new StringTokenizer(s," ");
			while(st.hasMoreTokens())
			{
				s1=toString(st.nextToken());
				t=s1.charAt(0);
				if(t>=65&&t<=90||t>=97&&t<=122)
				{
					ar1[t1]=s1;
					t1=t1+1;
				}
				else if(t>=48&&t<=57)
				{
					ar2[t2]=Integer.parseInt(s1);
					t2=t2+1;
				}
			}
			for(j=0;j<t1;j++)
			{
				for (k=0;k<t1;k++)
				{
					if(ar1[j].compareTo(ar1[k])<0)
					{
						tem1=ar1[j];
						ar1[j]=ar1[k];
						ar1[k]=tem1;
					}
				}
			}
			for(j=0;j<t2;j++)
			{
				for (k=0;k<t2;k++)
				{
					if(ar2[j]<ar2[k])
					{
						tem2=ar2[j];
						ar2[j]=ar2[k];
						ar2[k]=tem2;
					}
				}
			}
			for(j=0;j<t2;j++)
			{
				System.out.print(ar1+" "+ar2+" ");
			}
			System.out.println();
		}
	}
}