package com.student.cls;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by baoli on 15/7/23.
 */

@XmlRootElement
@Component
@Scope("singleton")
public class Student  {
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public Student(){}

    public Student(String fname, String lname, int age, int id) {
        this.firstName = fname;
        this.lastName = lname;
        this.age = age;
        this.id = id;
    }

    public void setFirstName(String fname) {
        this.firstName = fname;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lname) {
        this.lastName = lname;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString(){
        return new StringBuilder("First Name:").append(this.firstName).append("Last Name:").append(this.lastName).append("Age:").append(this.age).append("ID:").append(this.id).toString();
    }



}
