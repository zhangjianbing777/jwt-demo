package com.nmys.jwt.entity;

import lombok.Data;

/**
 * description
 *
 * @author 70KG
 * @date 2018/9/29
 */
@Data
public class Student implements Comparable<Student> {

    private String name;

    private Integer age;

    private Integer num;

    public Student() {
    }

    public Student(String name, Integer age, Integer num) {
        this.name = name;
        this.age = age;
        this.num = num;
    }

    @Override
    public int compareTo(Student student) {
        return student.getAge().compareTo(this.getAge());
    }
}
