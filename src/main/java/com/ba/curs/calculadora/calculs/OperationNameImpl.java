/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ba.curs.calculadora.calculs;

import javax.enterprise.util.AnnotationLiteral;

/**
 *
 * @author Sergi
 */
public class OperationNameImpl extends AnnotationLiteral<OperationName> implements OperationName{

    public final String name;

    public OperationNameImpl(String name) {
        this.name = name;
    }
    
    @Override
    public String value() {
        return name;
    }
    
}
