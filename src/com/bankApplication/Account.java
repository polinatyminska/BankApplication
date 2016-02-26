package com.bankApplication;

/**
 * Created by Тыминская on 21.02.2016.
 */
public interface Account  {
    float getBalance();
    void deposit(float x);
    void withdraw(float x);
    void printReport();
    void setOverdraft(float x);
}
