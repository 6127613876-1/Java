import java.util.Scanner;

public class bitwise {
        public static void main(String[] args) {
            int a = 1, b = 4;
            Scanner sc =new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println(a & b);
                }
                case 2 -> {
                    System.out.println(a | b);
                }
                case 3 -> {
                    System.out.println(~b);
                }
                case 4 -> {
                    System.out.println(a << b);
                }
                case 5 -> {
                    System.out.println(a >> b);
                }
                case 6 -> {
                    System.out.println(a >>> b);
                }
                default -> {
                    System.out.println("Invalid choice");
                }
            }
        } }
