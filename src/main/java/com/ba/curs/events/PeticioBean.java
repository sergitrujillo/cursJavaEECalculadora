/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ba.curs.events;

import javax.enterprise.event.Event;
import javax.inject.Inject;

/**
 *
 * @author Sergi
 */
public class PeticioBean {
 
    @Inject
    private Event<Peticio> eventPeticio;
    
    public void create(Peticio peticio){
        System.out.println("Inici Proces de creacio de peticio a nivell de ejb");
        eventPeticio.fire(peticio);
        System.out.println("Fi Proces de creacio de peticio a nivell de ejb");
    }
}
