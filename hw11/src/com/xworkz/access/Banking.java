package com.xworkz.access;

public class Banking {
        public String ownername;
        double balance;
        private Long accountNumber;

        public void deposit() {
            System.out.println("the name of the owner is :"+ownername);
            this.accountNumber=123456789L;
            System.out.println("The account number is :" + this.accountNumber);
        }

        void showBalance() { // Package-level instance method
            System.out.println("Balance: " + balance);
        }

        private void setAccountNumber() {
            System.out.println("the account number is :"+accountNumber);
        }
    }

