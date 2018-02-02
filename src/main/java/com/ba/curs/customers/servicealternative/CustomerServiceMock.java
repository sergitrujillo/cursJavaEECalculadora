/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ba.curs.customers.servicealternative;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Alternative;

/**
 *
 * @author Sergi
 */
@Alternative
public class CustomerServiceMock implements CustomerService{

    @Override
    public List<Customer> findAllCustomers() {
        ArrayList<Customer> list = new ArrayList<>();
        list.add(new Customer("Pepet"));
        list.add(new Customer("marieta")); 
        return list;
    }
    
}
