package com.notahmed.jpademo;

import com.notahmed.jpademo.dao.StudentDAO;
import com.notahmed.jpademo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			create  student
//			createStudent(studentDAO);

//			get student
//			getStudent(studentDAO);

//			get all students
//			gellAllStudents(studentDAO);

//			update a student
//			updateStudent(studentDAO);

//			delete a student
			deleteStudent(studentDAO, 2);

			gellAllStudents(studentDAO);

		};
	}

	private void deleteStudent(StudentDAO studentDAO, Integer id) {

		studentDAO.delete(id);
		System.out.println("Studente Deleted with id: " + id);
	}

	private void updateStudent(StudentDAO studentDAO) {
		Student updatedStudent = studentDAO.findById(1);
		updatedStudent.setEmail("updatedJohn@gmail,com");

		studentDAO.update(updatedStudent);
		System.out.println("Updated student " + updatedStudent);
	}

	public void createStudent(StudentDAO studentDAO) {
		Student newStudent  = new Student( "John", "Cena", "john@gmail.com");
		studentDAO.save(newStudent);
		System.out.println("Saved student with id: " + newStudent.getId());
	}

	public void getStudent(StudentDAO studentDAO) {
		Student student = studentDAO.findById(1);
		System.out.println(student);
	}

	public void gellAllStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();
		students.forEach(s -> System.out.println(s));
	}
}
