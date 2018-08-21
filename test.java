class test
{
    public static void main(String[] args)
    {
        int a[]={1,2,3,4};
        for (int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
        a[]=null;
        for (int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}