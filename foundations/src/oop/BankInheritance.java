package oop;

import java.math.BigDecimal;

public class BankInheritance {
    private final int accountNumber;
    private BigDecimal accountBalance;
    private String accountName;
    private String email;
    private int phoneNumber;

    public BankInheritance(int accountNumber, BigDecimal accountBalance, String accountName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountName = accountName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(accountBalance) > 0) {
            System.out.println("Insufficient funds");
        }
        else {
            accountBalance = accountBalance.subtract(amount);
            System.out.println("Withdrawal successful: "+amount);
        }

    }
    public void deposit(int amount) {
        accountBalance = accountBalance.add(new BigDecimal(amount));
        System.out.println("Deposit successful: "+accountBalance);
    }

    @Override
    public String toString() {
        return "BankInheritance [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + ", accountName="
                + accountName + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
    }
}
