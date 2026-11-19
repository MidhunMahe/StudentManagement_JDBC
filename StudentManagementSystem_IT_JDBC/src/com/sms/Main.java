package com.sms;

import java.sql.SQLException;

import com.sms.controller.StudentController;
import com.sms.repository.StudentRepository;
import com.sms.repository.StudentRepositoryImp;
import com.sms.service.StudentService;
import com.sms.service.StudentServiceImp;
import com.sms.view.StudentView;

public class Main {

	public static void main(String[] args) throws SQLException{
		StudentRepository repository = new StudentRepositoryImp();
		
		// Object Dependency Injection
		StudentService service = new StudentServiceImp(repository);
		StudentController controller  = new StudentController(service);
		StudentView view = new StudentView(controller);
		view.start();
	}
	
}
