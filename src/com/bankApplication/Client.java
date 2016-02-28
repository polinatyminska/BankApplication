package com.bankApplication;
import com.com.exception.OverdraftLimitExceededException;

import java.util.*;
import java.util.ArrayList;

/**
 * Created by Тыминская on 21.02.2016.
 */
public class Client implements  Report{
    private String name;
    private List<Account> accounts = new ArrayList<Account>();
    private Account activeAccount;
    private float initialOverdraft;
    Client () {
        initialOverdraft = 300;
    }
    Client (float overdraft) {
        initialOverdraft = overdraft;
    }
    Client (String nm) {
        name = nm;
    }
    public String getName() {
        return name;
    }
    public void setActiveAccount(Account a){
        activeAccount = a;
    }
    public  String getAccounts() {
        StringBuffer clientInfo = new StringBuffer();
        for (Account a: accounts) {
            clientInfo.append(a);
        }
        return clientInfo.toString();
    }
    public float getBalance () {
        float balanceTotal = 0;
        for (Account a :accounts) {
            balanceTotal = balanceTotal + a.getBalance();
        }
        return balanceTotal;
    }

    public void deposit (float x) {
        activeAccount.deposit(x);
    }
    public void withdraw (float x) throws OverdraftLimitExceededException{
        activeAccount.withdraw(x);
    }
    public Account createAccount(String accountType) {
        if (accountType == "S") {
            Account newSavingAccount = new SavingAccount();
            accounts.add(newSavingAccount);
            return newSavingAccount;
        }
        else if (accountType == "C"){
            Account newCheckAccount = new CheckingAccount();
            newCheckAccount.setOverdraft(initialOverdraft);
            accounts.add(newCheckAccount);
            return newCheckAccount;
        }
        else System.out.println("Invalid Account Type!");
        return null;
    }
    public void printReport() {
        System.out.println("Client " + getName() + "\n");
        System.out.println("Client total balance " + getBalance() + "\n" );
        for (Account a: accounts) {
            a.printReport();
        }
    }


}
