/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ba.curs.produces;

/**
 *
 * @author Sergi
 */
@Online
public class OperationOnline implements Operation{
    @Override
    public String operation() {
        return "Operació realizada online";
    }
}
