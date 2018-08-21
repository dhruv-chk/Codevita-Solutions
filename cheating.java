import java.util.*;
class cheating
{
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        tryS
        {
        int r=x.nextInt();
            if(r>10)
                throw new RunTimeException();
        }
        catch(RunTimeException e)
        {
            System.exit();
        }
        String msg=x.next();
        String line[]=msg.split("");
        int count=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<line.length;j++)
            {
                if(i==0)
                {
                    if(j%8==0)
                    {
                        
                        
                    }
                }
            }
        }
    }
}