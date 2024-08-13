package com.dcarson.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Dan",
                        "Carson",
                        LocalDate.now(),
                        "contact@dcarson.com",
                        25
                ),
                new Student(
                        "Ana",
                        "Carson",
                        LocalDate.now(),
                        "contact@acarson.com",
                        25
                )
        );
    }
}
