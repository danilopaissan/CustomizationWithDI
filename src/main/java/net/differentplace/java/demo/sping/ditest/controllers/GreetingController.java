package net.differentplace.java.demo.sping.ditest.controllers;

import net.differentplace.java.demo.sping.ditest.contract.IGreeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class GreetingController {

    private IGreeting greetingService;

    @Autowired
    public void initialize(IGreeting greeting){
        this.greetingService = greeting;
    }

    @RequestMapping(
            value = "/greeting/{who}",
            produces = { MediaType.APPLICATION_JSON_VALUE },
            method = RequestMethod.GET)
    public ResponseEntity<String> getGreeting(@PathVariable String who){
        return new ResponseEntity(greetingService.getGreeting(who),HttpStatus.OK);
    }
}
