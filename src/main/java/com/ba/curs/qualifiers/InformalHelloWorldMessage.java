/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ba.curs.qualifiers;

/**
 *
 * @author Sergi
 */
@Informal
public class InformalHelloWorldMessage implements Message{

    @Override
    public String get() {
        return "Hi World!!! ;)";
    }
    
}
