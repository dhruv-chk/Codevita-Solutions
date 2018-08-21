#include <stdio.h>
#include <stdlib.h>

int main()
{
        int N,K,i,s=0;
        scanf("%d%d",&N,&K);
        for(i=0;i<=K; i++)
        {
            if(i==0)
            {
                s=s+1;
            }
            else if (i%2==0&&i!=0)
            {
                s=s+(fact(N)/(fact(i)*fact(N-i)));
            }
        }
        printf("%d",s);
        return 0;
}

int fact(int a)
    {
        int i,f=1;
        for (i=1;i<=a;i++)
        {
            f=f*i;
        }
        return f;
    }
