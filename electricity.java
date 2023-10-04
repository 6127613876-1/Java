import java.util.Scanner;
public class electricity
{
    public static void main(String[] args) {
            System.out.println("Armstrong numbers between 1 and 4000:");
            for (int i = 1; i <= 4000; i++) {
                if (isArmstrong(i)) {
                    System.out.print(i + " ");
                }
            }
        }

        public static boolean isArmstrong(int num) {
            int originalNumber = num;
            int sum = 0;
            int numDigits = String.valueOf(num).length();

            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, numDigits);
                num /= 10;
            }

            return sum == originalNumber;
        }
}