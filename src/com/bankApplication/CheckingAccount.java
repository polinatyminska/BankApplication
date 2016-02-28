package com.bankApplication;

import com.com.exception.OverdraftLimitExceededException;

/**
 * Created by Тыминская on 21.02.2016.
 */
public class CheckingAccount extends AbstractAccount {
    private float overdraft;
    CheckingAccount () {
        overdraft = 300;
    }
    public void setOverdraft(float x) {
        overdraft = x;
    }
    public float getOverdraft (){
        return overdraft;
    }

    public void withdraw (float x) throws OverdraftLimitExceededException{

        if (getBalance() + overdraft >= x)
            setBalance(getBalance() - x );
        else {throw new OverdraftLimitExceededException();}
    }

    public void printReport() {
        System.out.println("Checking Account balance = " + getBalance() + "\n");
        System.out.println("Overdraft = " + getOverdraft() + "\n");
    }
}
