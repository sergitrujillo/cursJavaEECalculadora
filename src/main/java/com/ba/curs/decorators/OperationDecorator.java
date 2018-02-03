/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ba.curs.decorators;

import com.ba.curs.calculadora.calculs.Operation;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

/**
 *
 * @author Sergi
 */
@Decorator
public class OperationDecorator implements Operation{
    @Inject @Delegate @Any Operation operation;

    @Override
    public int operacio(int num1, int num2) {
        System.out.println("Inici decorator");
        int resultat = operation.operacio(num1, num2);
        System.out.println("El resultat de la operacio es: " + resultat);
        return resultat;
    }
    
    
}
