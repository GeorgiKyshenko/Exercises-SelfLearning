package com.example.uni_project.controllers;

import com.example.uni_project.models.Subject;
import com.example.uni_project.models.Teacher;
import com.example.uni_project.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    private final SubjectService subjectService;

    @Autowired
    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @PostMapping
    public void addSubject(@RequestBody Subject subject) {
        subjectService.addSubject(subject);
    }

    @DeleteMapping(path = "{subjectId}")
    public void removeSubject(@PathVariable("subjectId") Integer subjectID) {
        subjectService.removeSubject(subjectID);
    }

    @GetMapping
    public List<Subject> getSubjects() {
        return subjectService.getSubjects();
    }

    @PutMapping("/{subjectId}/teachers/{teacherId}")
    public Subject enroll(@PathVariable("subjectId") Integer subjectId,
                          @PathVariable("teacherId") Integer teacherId) {
        return subjectService.enroll(subjectId,teacherId);
    }

}
