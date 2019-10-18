package com.github.kdlug.bank;

public class AtmMachineFacade {
    private AtmMachine atmMachine;
    private BankSystem bankSystem;

    public AtmMachineFacade() {
        this.atmMachine = new AtmMachine();
        this.bankSystem = new BankSystem();
    }

    public void withdrawMoney() {
        atmMachine.enterPin(1234);
        if (bankSystem.validatePin(1234) && bankSystem.validateTransaction()) {
            System.out.println("Money withdrawn");
        }
    }
}
