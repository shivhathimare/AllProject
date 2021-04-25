package com.my.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.my.app.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
