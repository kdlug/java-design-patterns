package com.github.kdlug.bank;

public class BankSystem {
    void transferMoney() {
        System.out.println("Money transfered");
    }

    boolean validatePin(Integer pin) {
        System.out.println("PIN is valid");
        return true;
    }

    boolean validateTransaction() {
        System.out.println("Transaction is valid");
        return true;
    }

    void getTransactionHistory() {
        System.out.println("Transaction history");
    }
}
