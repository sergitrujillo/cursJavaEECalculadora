/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ba.curs.events;

import javax.enterprise.event.Observes;

/**
 *
 * @author Sergi
 */
public class SupervisioPeticio2 {
    
    
    public void revisarPeticio(@Observes Peticio peticio){
        System.out.println("Supervisio 2 de la peticio");
    }
    
}
