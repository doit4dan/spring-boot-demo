package com.dcarson.springdemo.student;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class DBStudentService implements StudentService{
    private final StudentRepository repository;

    public DBStudentService(StudentRepository repository){
        this.repository = repository;
    }

    @Override
    public Student save(Student s) {
        // if id is null, new record is inserted with repo save
        // otherwise, existing record is updated
        return repository.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return repository.save(s);
    }

    @Override
    public void delete(String email) {
        var student = findByEmail(email);
        if(student != null)
        {
            repository.deleteById(student.getId());
        }
        //repository.deleteByEmail(email);
    }
}
