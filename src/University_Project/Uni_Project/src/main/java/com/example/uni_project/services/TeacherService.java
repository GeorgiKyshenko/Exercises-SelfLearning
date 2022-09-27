package com.example.uni_project.services;

import com.example.uni_project.models.Student;
import com.example.uni_project.models.Subject;
import com.example.uni_project.models.Teacher;
import com.example.uni_project.repositories.SubjectRepository;
import com.example.uni_project.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;


    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public void removeTeacher(Integer teacherId) {
        teacherRepository.deleteById(teacherId);
    }

    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }

}
