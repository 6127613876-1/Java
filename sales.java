import java.util.Scanner;

public class sales {
    public static void main(String[] args) {
        double i,j;
        Scanner sc =new Scanner(System.in);
        double n=sc.nextInt();
        if (n>1 && n<=50) {
            i = (n) * 3 / 100;
            System.out.println(i);
        }
        if (n>=51 && n<=100) {
            i = (n) * 5 / 100;
            System.out.println(i);
        }
        if (n>=101 && n<=150) {
            i = (n) * 7 / 100;
            System.out.println(i);
        }
        if (n>150) {
            i = (n) * 10 / 100;
            System.out.println(i);
        }
    }
}