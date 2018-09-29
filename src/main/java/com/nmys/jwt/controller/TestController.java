package com.nmys.jwt.controller;

import com.nmys.jwt.entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * description
 *
 * @author 70KG
 * @date 2018/9/29
 */
public class TestController {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        Student student1 = new Student("张三",21,1);
        Student student2 = new Student("李四",22,2);
        Student student3 = new Student("王五",23,3);
        Student student4 = new Student("赵六",24,4);

        list.add(student4);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }

}
