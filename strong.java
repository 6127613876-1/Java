public class strong
{
    public static void main(String[] args) {
        int n=145,rem,sum=0;
        while (n>0)
        {
            int fact=1;
            rem=n%10;
            n=n/10;
            for (int i=1;i<=rem;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
        }
        System.out.println(sum);
    }
}
