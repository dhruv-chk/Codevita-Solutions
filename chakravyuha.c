#include <stdio.h>
#include <stdlib.h>

int main()
{
        int a[100][100],x[100],y[100],N,i,j,k=0,l=0,count=1,n,m,power=0,p=0;
        scanf("%d",&N);
        n=N;
        m=N;
        while (k<m&&l<n)
        {
            for(i=l;i<n;i++)
            {
                a[k][i]=count;
                if(count==1||count%11==0)
                {
                     x[p]=k;
                     y[p]=i;
                     power++;
                     p++;
                }
                count++;
            }
            k++;
            for (i=k;i<m;i++)
            {
                a[i][n-1]=count;
                if(count==1||count%11==0)
                {
                     x[p]=i;
                     y[p]=n-1;
                     power++;
                     p++;
                }
                count++;

            }
            n--;
            if (k<m)
            {
                for(i=n-1;i>=l;i--)
                {
                    a[m-1][i]=count;
                    if(count==1||count%11==0)
                    {
                        x[p]=m-1;
                        y[p]=i;
                        power++;
                        p++;
                    }
                    count++;
                }
                m--;
            }
            if(l<n)
            {
                for(i=m-1;i>=k;i--)
                {
                    a[i][l]=count;
                    if(count==1||count%11==0)
                    {
                        x[p]=i;
                        y[p]=l;
                        power++;
                        p++;
                    }
                    count++;
                }
                l++;
            }

        }
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                printf("%d\t",a[i][j]);
            }
            printf("\n");
        }
        printf("Total Power points : %d\n",power);
        for(i=0;i<p;i++)
        {
            printf("(%d,%d)\n",x[i],y[i]);
        }
 return 0;
}
