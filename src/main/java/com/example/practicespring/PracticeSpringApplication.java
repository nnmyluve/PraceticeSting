package com.example.practicespring;

import com.example.practicespring.Student;
import com.example.practicespring.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PracticeSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeSpringApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(StudentService studentService) {
        return args -> {
            System.out.println("============Display All Student student =============");
            studentService.selectAll().forEach(System.out::println);

            System.out.println("============== Insert Student=================");
            System.out.println("\nInserting new student:");
            Student kevin = new Student(11, "Sok Heng", "Male", 87);
            studentService.insert(kevin);
            studentService.selectAll().forEach(System.out::println);

            System.out.println("============== Update Student=================");
            System.out.println("\nUpdating student with ID 3:");
            studentService.updateById(3, new Student(3, "Ly Dara Updated", "Male", 100));
            System.out.println(studentService.selectById(3));

            System.out.println("============== Delete Student=================");
            System.out.println("\nDeleting student with ID 2:");
            studentService.deleteById(2);
            studentService.selectAll().forEach(System.out::println);
        };
    }
}
