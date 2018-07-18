package net.differentplace.java.demo.sping.ditest.contract;

import org.springframework.http.ResponseEntity;

public interface IGreeting {

    String getGreeting(String who);
}
