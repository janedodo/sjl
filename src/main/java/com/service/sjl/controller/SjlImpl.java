package com.service.sjl.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-24T04:30:48.883Z")

@RestSchema(schemaId = "sjl")
@RequestMapping(path = "/sjl", produces = MediaType.APPLICATION_JSON)
public class SjlImpl {

    @Autowired
    private SjlDelegate userSjlDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userSjlDelegate.helloworld(name);
    }

}
