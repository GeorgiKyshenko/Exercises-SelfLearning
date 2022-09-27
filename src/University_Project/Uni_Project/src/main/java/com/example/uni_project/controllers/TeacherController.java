package com.example.uni_project.controllers;


import com.example.uni_project.models.Student;
import com.example.uni_project.models.Teacher;
import com.example.uni_project.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping
    public void addTeacher(@RequestBody Teacher teacher) {
        teacherService.addTeacher(teacher);
    }

    @DeleteMapping(path = "{teacherId}")
    public void removeTeacher(@PathVariable("teacherId") Integer teacherId) {
        teacherService.removeTeacher(teacherId);
    }

    @GetMapping
    public List<Teacher> getTeachers() {
        return teacherService.getTeachers();
    }
}
