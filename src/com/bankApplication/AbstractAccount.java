package com.bankApplication;

/**
 * Created by Тыминская on 21.02.2016.
 */
public abstract class AbstractAccount implements Account {
    private float balance;
    public float getBalance (){
        return balance;
    }
    public void setBalance (float newBalance) {
        balance = newBalance;
    }
    public void deposit (float x){
        balance = balance + x;
    }
   // public abstract void setOverdraft(float x);
    public abstract void printReport();
}
