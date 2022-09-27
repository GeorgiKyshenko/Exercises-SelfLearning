package com.example.uni_project.services;

import com.example.uni_project.models.Subject;
import com.example.uni_project.models.Teacher;
import com.example.uni_project.repositories.SubjectRepository;
import com.example.uni_project.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;

    private final TeacherRepository teacherRepository;


    @Autowired
    public SubjectService(SubjectRepository subjectRepository, TeacherRepository teacherRepository) {
        this.subjectRepository = subjectRepository;
        this.teacherRepository = teacherRepository;
    }

    public void addSubject(Subject subject) {
        if (subject.getType().equals("Football")) {
            throw new IllegalArgumentException("You cant add boring subjects");
        }
        subjectRepository.save(subject);
    }

    public void removeSubject(Integer subjectID) {
        Subject subjectById = subjectRepository.findById(subjectID).orElseThrow();
//
        subjectRepository.deleteById(subjectById.getId());
    }

    public List<Subject> getSubjects() {
        return subjectRepository.findAll();
    }

    public Subject enroll(Integer subjectId, Integer teacherId) {
        Subject subject = subjectRepository.findById(subjectId).orElseThrow();
        Teacher teacher = teacherRepository.findById(teacherId).orElseThrow();

        subject.assignTeacher(teacher);
        return subjectRepository.save(subject);
    }

}
