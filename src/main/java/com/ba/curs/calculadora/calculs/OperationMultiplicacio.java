/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ba.curs.calculadora.calculs;

import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Sergi
 */
@RequestScoped
@OperationName("multiplicacio")
public class OperationMultiplicacio implements Operation{

    @Override
    public int operacio(int num1, int num2) {
        return num1 + num2;
    }
    
}
