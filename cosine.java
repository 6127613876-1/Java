import java.util.Scanner;
public class cosine
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the value of x: ");
            double x = sc.nextDouble();

            System.out.print("Enter a positive integer n: ");
            int n = sc.nextInt();

            double cosine = Cosine(x, n);
            System.out.println("Cosine of " + x + " using " + n + " terms: " + cosine);
        }
        public static double Cosine(double x, int n) {
            double result = 1.0;

            for (int i = 1; i <= n; i++) {
                double term = Math.pow(-1, i) * Math.pow(x, 2 * i) / fact(2 * i);
                result += term;
            }
            return result;
        }
        public static double fact(int n) {
            if (n == 0) {
                System.out.println("Enter a valid input");
            }
            double fact = 1.0;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }