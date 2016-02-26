package com.bankApplication;
//import com.events.EmailNotificationListener;
import com.events.EventNotificationListener;
//import com.events.PrintClientListener;

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
     //   EmailNotificationListener emailListener = new EmailNotificationListener();
     //   PrintClientListener printListener = new PrintClientListener();
     //   testBank.registerEvent(emailListener);
     //   testBank.registerEvent(printListener);
        Client firstClient = new Client("Ivan Ivanov");
        Client secondClient = new Client("Ivan Petrov");
        testBank.registerEvent(new EventNotificationListener() {
            @Override
            public void onClientAdded(Client c) {
                System.out.println("Email notification sent for new client");
            }
        });

        testBank.registerEvent(new EventNotificationListener() {
            @Override
            public void onClientAdded(Client c) {
                System.out.println("Print message: New client added");
            }
        });

        testBank.addClient(firstClient);
        Account firstClientSavAcct = firstClient.createAccount("S");
        firstClientSavAcct.deposit(1000);
        Account firstClientCheckAcct = firstClient.createAccount("C");
        firstClientCheckAcct.withdraw(200);
        firstClientSavAcct.withdraw(300);


        testBank.addClient(secondClient);
        Account secondClientCheckAcct = secondClient.createAccount("C");
        secondClientCheckAcct.deposit(500);
        secondClientCheckAcct.withdraw(100);
        secondClientCheckAcct.setOverdraft(400);
        secondClientCheckAcct.withdraw(15);
    }
}
