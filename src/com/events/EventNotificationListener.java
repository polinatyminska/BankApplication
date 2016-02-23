package com.events;

import com.bankApplication.Client;

/**
 * Created by ptyminska on 23.02.2016.
 */
public interface EventNotificationListener {
    void onClientAdded(Client c);
}
