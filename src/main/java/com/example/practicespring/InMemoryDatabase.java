package com.example.practicespring;

import com.example.practicespring.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InMemoryDatabase {

    @Bean
    public List<Student> studentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Heng Nita", "Female", 85.5));
        students.add(new Student(2, "Ey Channim", "Female", 78.0));
        students.add(new Student(3, "Te Channy", "Female", 92.3));
        students.add(new Student(4, "Roth Narita", "Female", 67.8));
        students.add(new Student(5, "Heng Chandalen", "Female", 88.9));
        students.add(new Student(6, "Phorn Sotheara", "Female", 73.4));
        students.add(new Student(7, "Kim namjoon", "Male", 95.0));
        students.add(new Student(8, "Heng Chalita", "Female", 82.2));
        students.add(new Student(9, "Cha Eunwoo", "Male", 90.5));
        students.add(new Student(10, "Heng Ra", "Male", 76.1));

        return students;
    }
}
