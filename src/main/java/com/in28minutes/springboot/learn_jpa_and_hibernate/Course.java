package com.in28minutes.springboot.learn_jpa_and_hibernate;

public class Course {
    private long id;
    private String author;
    private String name;

    public Course(){

    }

    public Course(long id, String author, String name) {
        super();
        this.id = id;
        this.author = author;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}
