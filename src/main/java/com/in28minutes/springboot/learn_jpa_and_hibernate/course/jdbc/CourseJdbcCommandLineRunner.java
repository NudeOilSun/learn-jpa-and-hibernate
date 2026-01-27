package com.in28minutes.springboot.learn_jpa_and_hibernate.course.jdbc;

import com.in28minutes.springboot.learn_jpa_and_hibernate.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception{
        repository.insert(new Course(1, "In28Minutes", "Learn AWS Now!"));
        repository.insert(new Course(2, "In28Minutes", "Learn Azure Now!"));
        repository.insert(new Course(3, "In28Minutes", "Learn DevOps Now!"));
        repository.deleteById(1);

        System.out.println(repository.selectById(2));
        System.out.println(repository.selectById(3));
    }
}
