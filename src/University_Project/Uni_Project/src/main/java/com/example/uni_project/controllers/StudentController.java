package com.example.uni_project.controllers;


import com.example.uni_project.models.Student;
import com.example.uni_project.models.Subject;
import com.example.uni_project.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void removeStudent(@PathVariable("studentId") Integer studentId) {
        studentService.removeStudent(studentId);
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PutMapping("/{studentId}/subjects/{subjectId}")
    public Student addSubject(@PathVariable("studentId") Integer studentID,
                              @PathVariable("subjectId") Integer subjectID) {
        return studentService.addSubject(studentID,subjectID);
    }
}
