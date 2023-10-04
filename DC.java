import java.util.Scanner;
public class DC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int n = sc.nextInt();
        System.out.println("1. Decimal to Octal");
        System.out.println("2. Decimal to Binary");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                String octalResult = decimalToOctal(n);
                System.out.println("Octal: " + octalResult);
                break;
            case 2:
                String binaryResult = decimalToBinary(n);
                System.out.println("Binary: " + binaryResult);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    public static String decimalToOctal(int n) {
        StringBuilder octal = new StringBuilder();
        while (n > 0) {
            int remainder = n % 8;
            octal.insert(0, remainder);
            n /= 8;
        }
        return octal.toString();
    }

    public static String decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            binary.insert(0, remainder);
            n /= 2;
        }
        return binary.toString();
    }
}
