package com.bankApplication;

/**
 * Created by Тыминская on 21.02.2016.
 */
public class SavingAccount extends AbstractAccount {
    public void withdraw (float x){
        if (getBalance() >= x)
            setBalance(getBalance() -x );
        else System.out.println("Withdraw not possible!");
    }
    public void printReport() {
        System.out.println("Saving Account balance = " + getBalance() + "\n");
    }
}
