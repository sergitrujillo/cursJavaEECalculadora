/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ba.curs.inteceptors;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sergi
 */
@Log
public class BookShow {
    
    public List<String> getMoviesList(String gender){
        System.out.println("getMovieList() method starts execution");
        List<String> moviesAvailable = new ArrayList<>();
        moviesAvailable.add("12 Angry Men");
        moviesAvailable.add("Kings speech");
        System.out.println("getMoviesList() method finish execution");
        return moviesAvailable;
    }
    
    public Integer getDiscountedPrice(int ticketPrice){
        return ticketPrice -50;
    }
}
