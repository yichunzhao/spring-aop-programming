package com.ynz.demo.aop.service;

import com.ynz.demo.aop.aspect.Stealth;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Modify greeting behaviour after the method is called.
 */
@Service
@NoArgsConstructor
public class GreetingService {

    @Stealth
    public void Greeting(String personName) {
        System.out.println("Hello " + personName);
    }

    @Stealth
    public void WarmGreeting(String personName) {
        System.out.println("warm welcome " + personName);
    }

    @Stealth
    public void HotGreeting(String personName) {
        System.out.println("greatly welcome " + personName);
    }
}
