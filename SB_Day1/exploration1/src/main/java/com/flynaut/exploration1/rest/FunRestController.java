package com.flynaut.exploration1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class FunRestController {

    //exposing an endpoint - "/name" which is returning name
    @GetMapping("/name")
    public String sayName(){
        return "PrasadJain";
    }

    //To return today's date
    //@RequestMapping(value = "/date",method = RequestMethod.GET)
    @GetMapping("/dateTime")
    public LocalDate date(){
        LocalDate localDate = LocalDate.now();
        return localDate;
    }

    //To return yesterday's date
}
