import java.io.*;
import java.util.Scanner;
class bank {
    private int accountNumber;
    private int balance;
    public int getAccno() {
        return accountNumber;
    }
    public int getBal() {
        return balance;
    }
    public void setAccno(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBal(int balance) {
        this.balance = balance;
    }
    public float intrest(int deposit, int rt, int time) {
        float interest = (deposit * rt * time) / 100;
        return interest;
    }
}
class test {
    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);
        Scanner td = new Scanner(System.in);
        final int  rt = 2;
        bank b = new bank();
        b.setAccno(652009);
        b.setBal(50000);
        System.out.println("Your account number is:" + b.getAccno());
        System.out.println("your account balance is:" + b.getBal());
        System.out.println(" enter your deposite amount :");
        int deposit = dp.nextInt();
        System.out.println("enter  time duration :");
        int time = td.nextInt();
        System.out.println("your interest :" +b.intrest(deposit,rt,time));
    }
}
