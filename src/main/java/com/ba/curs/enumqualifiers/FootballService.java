/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ba.curs.enumqualifiers;

/**
 *
 * @author Sergi
 */
@Sport(Sports.FOOTBALL)
public class FootballService implements SportService {

    @Override
    public String play() {
        return "Playing Football!";
    }

}
