import java.util.Scanner;

public class perfectnim {
    public static void main(String[] args) {
        int i,sum=0;
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for (i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if (sum==n)
        {
            System.out.println("Perfect number");
        }
        else
        {
            System.out.print("Not a Perfect Number");
        }
    }
}