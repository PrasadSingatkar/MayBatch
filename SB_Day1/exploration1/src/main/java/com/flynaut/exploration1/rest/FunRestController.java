package com.flynaut.exploration1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //exposing an endpoint - "/name" which is returning name
    @GetMapping("/name")
    public String sayName(){
        return "PrasadJain";
    }

    //To return today's date
    //To return yesterday's date
}
