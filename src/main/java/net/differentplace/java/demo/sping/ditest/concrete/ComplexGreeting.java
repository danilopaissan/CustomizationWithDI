package net.differentplace.java.demo.sping.ditest.concrete;

import net.differentplace.java.demo.sping.ditest.contract.IGreeting;
import org.springframework.stereotype.Service;

@Service
public class ComplexGreeting implements IGreeting {
    @Override
    public String getGreeting(String who) {
        return "Hello " + who + ", my dear friend!";
    }
}
