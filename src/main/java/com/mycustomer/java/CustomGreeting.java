package com.mycustomer.java;

import net.differentplace.java.demo.sping.ditest.contract.IGreeting;
import org.springframework.stereotype.Service;

@Service
public class CustomGreeting implements IGreeting {
    @Override
    public String getGreeting(String who) {
        return "Ciao " + who;
    }
}
