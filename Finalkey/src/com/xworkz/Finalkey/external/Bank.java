package com.xworkz.Finalkey.external;
public class Bank {
        private final String accountNumber = "Ka125";
        private double balance;
        private String Bank;

        public Bank(String accountNumber, double balance,String bank) {
//            this.accountNumber = accountNumber;
            this.balance = balance;
            this.Bank=bank;
        }
        public final void Details() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Current Balance:" + balance);
            System.out.println("the Bank is :"+ Bank);
        }
}
