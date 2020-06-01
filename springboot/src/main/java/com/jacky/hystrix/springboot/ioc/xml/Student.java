package com.jacky.hystrix.springboot.ioc.xml;

import java.util.List;

/**
 * @author chenjiaqi
 * @create 2020-05-31
 */
public class Student {
    private String name;
    private Integer age;
    private List<String> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", courses=" + courses +
                '}';
    }
}
