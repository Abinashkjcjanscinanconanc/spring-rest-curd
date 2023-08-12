package org.jt.springrest;

import org.jt.springrest.model.Employee;
import org.jt.springrest.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringrestApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);


			}

			@Autowired
			private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee= new Employee();
		employee.setFirstName("Satabdi");
		employee.setLastName("Mohanty");
		employee.setEmailId("mohanty@gmail.com");
		employeeRepository.save(employee);



		Employee employee1= new Employee();
		employee1.setFirstName("Satabdi1");
		employee1.setLastName("Mohanty1");
		employee1.setEmailId("mohanty1@gmail.com");
		employeeRepository.save(employee1);
	}
}
