/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ba.curs.calculadora.rest;

import com.ba.curs.calculadora.calculs.Operation;
import com.ba.curs.calculadora.calculs.OperationNameLiteral;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Sergi
 */
@Path("calculator")
@RequestScoped
public class CalculatorResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CalculatorResource
     */
    public CalculatorResource() {
    }

    /**
     * Retrieves representation of an instance of
     * com.ba.curs.calculadora.rest.CalculatorResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        return "AIXÒ ÉS UNA PROVA";
    }

    @Inject
    @Any
    private Instance<Operation> operation;

    @GET
    @Path("{operation}/{num1}/{num2}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOperacio(
            @PathParam("operation") String operacio,
            @PathParam("num1") int num1,
            @PathParam("num2") int num2) {
        
        Operation op = this.operation.select(new OperationNameLiteral(operacio)).get();
        int resultat = op.operacio(num1, num2);
        JsonObject resultObject = Json.createObjectBuilder()
                .add("resultat", resultat)
                .build();
        return Response.ok(resultObject).build();
    }

    /**
     * PUT method for updating or creating an instance of CalculatorResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
