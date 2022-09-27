package com.example.uni_project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Entity
@Table(name = "subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String type;
    @JsonIgnore
    @ManyToMany(mappedBy = "subjects", targetEntity = Student.class)
    private Set<Student> students;

    @ManyToOne
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacher;

    public Subject(String type) {
        this.type = type;
        this.students = new HashSet<>();
    }

    public Subject() {
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Student> getStudents() {
        return Collections.unmodifiableSet(students);
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
