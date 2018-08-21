import java.util.Scanner;
import java.util.Arrays;


public class pallindrome {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		int pat3[]={123,132,213,231,312,321};
		int pat4[]={1234,1243,1324,1342,1423,1432,2134,2143,2314,2341,2413,2431,3124,3142,3214,3241,3412,3421,4123,4132,4213,4231,4312,4321};
		int pat2[]={12,21};
		Scanner s2 = new Scanner(System.in);
		String test=s2.nextLine();
		int t=Integer.parseInt(test);
		char ch[]=new char[26];
		int c[]=new int[26];
		
		while(t>0&&t<=10){
		 Scanner s1 = new Scanner(System.in);
		String word=s1.nextLine();
		int len=word.length();
		int l=len/2;
		for(int i=0;i<l;i++)
		{
			c[i]=(int)word.charAt(i);
		}
		//sort(c, 0, l-1);
		 for(int i=0;i<l;i++)
			{
			 	ch[i]=(char)c[i];
				
			}
		 switch (l)
		 {
		 case 0:
			 System.out.println(word);
			 break;
		 case 1:
			 if(word.length()%2==0)
			 {
				if(word.charAt(0)>word.charAt(1))
				{
					String w=""+word.charAt(1) + word.charAt(0);
					System.out.println(w);
					System.out.println(word);
				}
			 }
			 if(word.length()%2!=0)
			 {
				if(word.charAt(0)>word.charAt(2))
				{
					String w=""+word.charAt(2)+word.charAt(1)+ word.charAt(0);
					System.out.println(w);
					System.out.println(word);
				}
			 }
			 
			 break;
		 case 2 :
			 
			 if(word.length()%2==0)
			 {
				if(word.charAt(0)>word.charAt(1))
				{
					String w=""+word.charAt(1) + word.charAt(0);
					String w1=word.charAt(0)+""+word.charAt(1);
					System.out.println(w+w1);
					System.out.println(word);
				}
			 }
			 if(word.length()%2!=0)
			 {
				if(word.charAt(0)>word.charAt(1))
				{
					String w=""+word.charAt(1) + word.charAt(0);
					String w1=word.charAt(0)+""+word.charAt(1);
					String w3=""+word.charAt(2);
					System.out.println(w+w3+w1);
					System.out.println(word);
				}
			 }
			 break;
			 
		 case 3:
			 if(word.length()%2==0)
			 {
				 String w1="",w2="";
				 int pt;
				 for(int p=0;p<6;p++)
				 {
					 w1="";w2="";
				for (int i=0;i<=2;i++){
				pt=pat3[p];
				pt=pt/(int)Math.pow(10,(2-i));
				pt=pt%10-1;				
				 w1=w1+ch[pt];
				 w2=ch[pt]+w2;
				}
				System.out.println(w1+w2);
			 }
		 
		 }
			 if(word.length()%2!=0)
			 {
				 String w1="",w2="",w3=""+word.charAt(3);
				 int pt;
				 for(int p=0;p<6;p++)
				 {
					 w1="";w2="";
				for (int i=0;i<=2;i++){
					
				pt=pat3[p];
				
				pt=pt/(int)Math.pow(10,(2-i));
				pt=pt%10-1;	
				
				 w1=w1+ch[pt];
				 w2=ch[pt]+w2;
				}
				System.out.println(w1+w3+w2);
			 }
				 
			 }
			 break;
			 
		 case 4:
			 if(word.length()%2==0)
			 {
				 String w1="",w2="";
				 int pt;
				 for(int p=0;p<24;p++)
				 {
					 w1="";w2="";
				for (int i=0;i<=3;i++){
				pt=pat4[p];
				pt=pt/(int)Math.pow(10,(3-i));
				pt=pt%10-1;				
				 w1=w1+ch[pt];
				 w2=ch[pt]+w2;
				}
				System.out.println(w1+w2);
			 }
		 
		 }
			 if(word.length()%2!=0)
			 {
				 String w1="",w2="",w3=""+word.charAt(4);
				 int pt;
				 for(int p=0;p<24;p++)
				 {
					 w1="";w2="";
				for (int i=0;i<=3;i++){
					
				pt=pat4[p];
				
				pt=pt/(int)Math.pow(10,(3-i));
				pt=pt%10-1;	
				
				 w1=w1+ch[pt];
				 w2=ch[pt]+w2;
				}
				System.out.println(w1+w3+w2);
			 }
				 
			 }
			 break;
		 case 5:
			 if(word.length()%2==0)
			 {
				 String w1="",w2="";
				 int pt;
				 for(int p=0;p<120;p++)
				 {
					 w1="";w2="";
				for (int i=0;i<=4;i++){
				pt=pat4[p];
				pt=pt/(int)Math.pow(10,(4-i));
				pt=pt%10-1;	
				if(pt>=p)
					pt=pt+1;
				if(i==0)
				{
					 w1=w1+ch[p];
					 w2=ch[p]+w2;
				}
				else
				{
				 w1=w1+ch[pt];
				 w2=ch[pt]+w2;
				}
				}
				System.out.println(w1+w2);
			 }
		 
		 }
			 if(word.length()%2!=0)
			 {
				 String w1="",w2="",w3=""+word.charAt(5);
				 int pt;
				 for(int p=0;p<24;p++)
				 {
					 w1="";w2="";
				for (int i=0;i<=4;i++){
					
				pt=pat4[p];
				
				pt=pt/(int)Math.pow(10,(3-i));
				pt=pt%10-1;	
				if(pt>=p)
					pt=pt+1;
				if(i==0)
				{
					 w1=w1+ch[p];
					 w2=ch[p]+w2;
				}
				else
				{
				 w1=w1+ch[pt];
				 w2=ch[pt]+w2;
				}
				}
				System.out.println(w1+w3+w2);
			 }
				 
			 }
			 break;
			 
			 
			 
		 }
			 
	
		
		
		t--;
		}

	}
	static void merge(int arr[], int l, int m, int r)
	    {
	       
	        int n1 = m - l + 1;
	        int n2 = r - m;
	 
	       
	        int L[] = new int [n1];
	        int R[] = new int [n2];
	 
	       
	        for (int i=0; i<n1; ++i)
	            L[i] = arr[l + i];
	        for (int j=0; j<n2; ++j)
	            R[j] = arr[m + 1+ j];
	 
	 
	     
	        int i = 0, j = 0;
	 
	        
	        int k = l;
	        while (i < n1 && j < n2)
	        {
	            if (L[i] <= R[j])
	            {
	                arr[k] = L[i];
	                i++;
	            }
	            else
	            {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	 
	        while (i < n1)
	        {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	 
	     
	        while (j < n2)
	        {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }
	 
	    
	    static void sort(int arr[], int l, int r)
	    {
	        if (l < r)
	        {
	            int m = (l+r)/2;
	 
	            
	            sort(arr, l, m);
	            sort(arr , m+1, r);
	 
	          
	            merge(arr, l, m, r);
	        }
	    }

}
