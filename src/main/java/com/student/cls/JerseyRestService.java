package com.student.cls;

import javax.ws.rs.GET;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.student.cls.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by baoli on 15/7/23.
 *
 */
@Component
@Path("/jsonServices")
public class JerseyRestService {

    @Autowired
    private StudentService studentService;


    @GET
    @Path("getmsg")
//    @Produces("text/plain")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getMsg(){
        System.out.println("getMsg()");
        return studentService.getMessage();

    }

}
