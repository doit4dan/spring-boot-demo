package com.dcarson.springdemo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// no need to put Repository notation, it is automatically added when extending Jpa Repo

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // queries are automatically generated behind the scenes by naming convention and matching column name
    Student findByEmail(String email);
    void deleteByEmail(String email);
}
