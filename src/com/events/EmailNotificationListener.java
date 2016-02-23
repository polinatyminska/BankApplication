package com.events;

import com.bankApplication.Client;

/**
 * Created by ptyminska on 23.02.2016.
 */
//using anonymous class instead
public class EmailNotificationListener implements EventNotificationListener {
    public void onClientAdded(Client c) {
        System.out.println("Email notification sent for new client: " + c.getName());
    }
}
