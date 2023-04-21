package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.repository.StudentRepository;
import com.example.sms.entity.Student;
@SpringBootApplication
@EnableAutoConfiguration
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception{
		
		/*
		 * Student student1 = new Student("Ram", "Kiran", "ram@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Sam", "Ruth", "sam@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("Jai", "Nihan", "jai@gmail.com");
		 * studentRepository.save(student3);
		 */
		
		
		
	}

}
