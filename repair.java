 import java.util.Scanner;
    class BankAccount {
        private String accountNumber;
        private double balance;
        private double fixedDepositAmount;
        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        public String getAccountNumber() {
            return accountNumber;
        }
        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }
        public double getBalance() {
            return balance;
        }
        public void setBalance(double balance) {
            this.balance = balance;
        }
        public double getFixedDepositAmount() {
            return fixedDepositAmount;
        }
        public void setFixedDepositAmount(double fixedDepositAmount) {
            this.fixedDepositAmount = fixedDepositAmount;
        }
        public double calculateInterest(double interestRate) {
            return fixedDepositAmount * interestRate / 100;
        }
    }
 public class repair {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter account number: ");
            String accountNumber = scanner.nextLine();
            System.out.print("Enter initial balance: ");
            double initialBalance = scanner.nextDouble();
            BankAccount bankAccount = new BankAccount(accountNumber, initialBalance);
            System.out.print("Enter fixed deposit amount: ");
            double fixedDepositAmount = scanner.nextDouble();
            bankAccount.setFixedDepositAmount(fixedDepositAmount);
            System.out.print("Enter fixed deposit interest rate: ");
            double interestRate = scanner.nextDouble();
            double interest = bankAccount.calculateInterest(interestRate);
            System.out.println("Interest on fixed deposit: " + interest);
            scanner.close();
        }
    }