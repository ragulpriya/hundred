import java.io.*;
import java.util.*;
class hcfffe
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int hcf=0;
        int min=Math.min(a,b);
        for(int i=min;i>=1;i--)
        {
            if((a%i==0)&&(b%i==0))
            {
                hcf=i;
                break;
            }
        }
        System.out.print(hcf);
    }
}
