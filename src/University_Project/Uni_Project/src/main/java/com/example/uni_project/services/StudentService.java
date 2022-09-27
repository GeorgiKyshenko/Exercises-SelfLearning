package com.example.uni_project.services;

import com.example.uni_project.models.Subject;
import com.example.uni_project.repositories.StudentRepository;
import com.example.uni_project.models.Student;
import com.example.uni_project.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    private final SubjectRepository subjectRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository, SubjectRepository subjectRepository) {
        this.studentRepository = studentRepository;
        this.subjectRepository = subjectRepository;
    }

    public void addStudent(Student student) {
        Optional<Student> nameCheck = studentRepository.findStudentByName(student.getName());
        if (nameCheck.isPresent()) {
            throw new IllegalArgumentException("This name already exists");
        }
        studentRepository.save(student);
    }

    public void removeStudent(Integer studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if (!exists) {
            throw new IllegalArgumentException("Student with ID " + studentId + " does not exists");
        }
        studentRepository.deleteById(studentId);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();

    }

    public Student addSubject(Integer studentID, Integer subjectID) {

        Student student = studentRepository.findById(studentID).orElseThrow();
        Subject subject = subjectRepository.findById(subjectID).orElseThrow();

        student.enrollSubject(subject);
        return studentRepository.save(student);
    }
}
