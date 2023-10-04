import java.util.Scanner;
public class bit {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose an operation:");
            System.out.println("1. Bitwise AND");
            System.out.println("2. Bitwise OR");
            System.out.println("3. Bitwise NOT");
            System.out.println("4. Left Shift");
            System.out.println("5. Right Shift");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bitwiseAnd();
                    break;
                case 2:
                    bitwiseOr();
                    break;
                case 3:
                    bitwiseNot();
                    break;
                case 4:
                    leftShift();
                    break;
                case 5:
                    rightShift();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        public static void bitwiseAnd() {
            int a = 5;
            int b = 3;
            int result = a & b;
            System.out.println("Bitwise AND: " + result);
        }

        public static void bitwiseOr() {
            int a = 5;
            int b = 3;
            int result = a | b;
            System.out.println("Bitwise OR: " + result);
        }

        public static void bitwiseNot() {
            int a = 5;
            int result = ~a;
            System.out.println("Bitwise NOT: " + result);
        }

        public static void leftShift() {
            int a = 5;
            int result = a << 1;
            System.out.println("Left Shift: " + result);
        }

        public static void rightShift() {
            int a = 5;
            int result = a >> 1;
            System.out.println("Right Shift: " + result);
        }
    }