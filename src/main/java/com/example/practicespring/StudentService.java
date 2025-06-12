package com.example.practicespring;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final List<Student> studentList;

    public StudentService(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void insert(Student student) {
        studentList.add(student);
    }

    public List<Student> selectAll() {
        return studentList;
    }

    public Student selectById(int id) {
        return studentList.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean updateById(int id, Student updatedStudent) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.set(i, updatedStudent);
                return true;
            }
        }
        return false;
    }

    public boolean deleteById(int id) {
        return studentList.removeIf(s -> s.getId() == id);
    }
}
