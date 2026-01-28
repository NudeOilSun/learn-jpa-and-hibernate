package com.in28minutes.springboot.learn_jpa_and_hibernate.course;

import com.in28minutes.springboot.learn_jpa_and_hibernate.Course;
import com.in28minutes.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception{

        //Work for JDBC and JPA
//        repository.insert(new Course(1, "In28Minutes", "Learn AWS JPA!"));
//        repository.insert(new Course(2, "In28Minutes", "Learn Azure JPA!"));
//        repository.insert(new Course(3, "In28Minutes", "Learn DevOps JPA!"));
//        repository.deleteById(1);
//
//        System.out.println(repository.findById(2));
//        System.out.println(repository.findById(3));

        //Work for Spring Data JPA
        repository.save(new Course(1, "In28Minutes", "Learn AWS JPA!"));
        repository.save(new Course(2, "In28Minutes", "Learn Azure JPA!"));
        repository.save(new Course(3, "In28Minutes", "Learn DevOps JPA!"));
        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("In28Minutes"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("Learn DevOps JPA!"));
    }
}
