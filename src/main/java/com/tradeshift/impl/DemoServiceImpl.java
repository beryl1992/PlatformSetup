package com.tradeshift.impl;

import com.tradeshift.demo.DemoService;
import org.springframework.stereotype.Component;



/**
 * Created by baoli on 15/7/23.
 */

@Component
public class DemoServiceImpl implements DemoService {

    public String say(){

        return "Hello Jersey";
    }
}
