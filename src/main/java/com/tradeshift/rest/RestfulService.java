package com.tradeshift.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import com.tradeshift.demo.DemoService;


/**
 * Created by baoli on 15/7/23.
 */

@Component
@Path("/demo")

 public class RestfulService {

    @Autowired
    DemoService demoService;

    @GET
    @Path("/hello")
    public String sayHello() {
        System.out.println("sayHello()");
        return demoService.say();

    }

}