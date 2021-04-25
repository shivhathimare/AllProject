package com.my.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.my.app.model.Student;
import com.my.app.repo.StudentRepository;
@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		/*
		 * Student s=new Student(); s.setSid(101); s.setSname("Shiv");
		 * s.setSfee(45632.2); repo.save(s);
		 */
		
		repo.save(new Student(101,"Bhola",123.3));
		repo.save(new Student(102,"Shiv",321.5));
		repo.save(new Student(103,"Gola",9875.2));
		
		
	}

}
