public class gcd
{
    public static void main(String[] args)
    {
        int i,n1=15,n2=10,a;
        if (n1>n2)
        {
           a=n2;
        }
        else
        {
            a = n1;
        }
        for (i=2; i<=a; i++)
        {
            if (n1%i==0&&n2%i==0)
            {
                System.out.println(i);
            }
        }
    }
}