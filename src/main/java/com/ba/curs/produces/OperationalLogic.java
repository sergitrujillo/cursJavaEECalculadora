/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ba.curs.produces;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;


/**
 *
 * @author Sergi
 */
public class OperationalLogic {
    
    private boolean online = true;
    
    
    @Produces
    public Operation getOperation(@Online Operation opOnline, @Offline Operation opOffline){
        return online ? opOnline : opOffline;      
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
    
}
