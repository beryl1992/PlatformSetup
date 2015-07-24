package com.student.cls;

/**
 * Created by baoli on 15/7/24.
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class StudentService {

    @Autowired
    private Student student;
    public StudentService(){
        System.out.println("StudentService");
    }


    public Student getMessage(){

        student.setFirstName("beryl");
        student.setLastName("baoli");
        student.setAge(22);
        student.setId(1);
        System.out.println("getMessage");
        return student;
    }



}
