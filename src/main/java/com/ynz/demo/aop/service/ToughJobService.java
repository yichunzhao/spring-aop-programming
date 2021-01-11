package com.ynz.demo.aop.service;

import com.ynz.demo.aop.aspect.TimeConsumption;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class ToughJobService {

    @TimeConsumption
    public Long longRunTask(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return 2021L;
    }
}
