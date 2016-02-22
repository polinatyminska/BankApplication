package com.bankApplication;
import java.util.ArrayList;
import java.util.*;
/**
 * Created by Тыминская on 21.02.2016.
 */
public class BankApplication {
    public static void main (String [] args) {
        Bank myBank = new Bank();
        initialize(myBank);
        myBank.printReport();
    }
    public static void initialize (Bank testBank) {
        //First client
        Client firstClient = new Client("Ivan Ivanov");
        testBank.clients.add(firstClient);
        Account firstClientSavAcct = firstClient.createAccount("S");
        firstClientSavAcct.deposit(1000);
        Account firstClientCheckAcct = firstClient.createAccount("C");
        firstClientCheckAcct.withdraw(200);
        firstClientSavAcct.withdraw(300);

        Client secondClient = new Client("Ivan Petrov");
        testBank.clients.add(secondClient);
        Account secondClientCheckAcct = secondClient.createAccount("C");
        secondClientCheckAcct.deposit(500);
        secondClientCheckAcct.withdraw(600);
        //secondClientCheckAcct.setOverdraft(400);
        secondClientCheckAcct.withdraw(1500);
    }
}
