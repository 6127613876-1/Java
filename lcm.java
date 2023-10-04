import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        int a,b,lcm;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b= sc.nextInt();
        lcm=(a<b) ? a:b;
        while (true)
        {
            if (lcm%a==0 && lcm%b==0)
            {
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
    }
}