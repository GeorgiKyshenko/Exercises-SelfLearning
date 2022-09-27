package com.example.uni_project.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @JsonIgnore
    @OneToMany(mappedBy = "teacher", targetEntity = Subject.class)
    private Set<Subject> subjects;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        this.subjects = new HashSet<>();
    }

    public Teacher() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<Subject> getSubjects() {
        return Collections.unmodifiableSet(subjects);
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void enrollSubject(Subject subject) {
        subjects.add(subject);
    }
}
