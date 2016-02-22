package com.bankApplication;
import java.util.ArrayList;
import java.util.*;
/**
 * Created by Тыминская on 21.02.2016.
 */
public class Bank implements Report  {
    List<Client> clients = new ArrayList<Client>();
   public  String getClients() {
        StringBuffer bankInfo = new StringBuffer();
        for (Client c: clients) {
            bankInfo.append(c);
        }
        return bankInfo.toString();
    }
   public void printReport() {
       System.out.println("Bank report");
       for (Client c: clients) {
           c.printReport();
       }
    }
}
