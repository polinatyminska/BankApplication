package com.com.exception;

/**
 * Created by ptyminska on 26.02.2016.
 */
public class NotEnoughFundsException {
    private String exceptionInfo;
    private float amount;
    NotEnoughFundsException(String exceptionInfo, float amount){
        this.exceptionInfo = exceptionInfo;
        this.amount = amount;
    }
}
