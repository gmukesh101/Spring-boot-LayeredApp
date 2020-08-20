package in.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import in.nit.model.Dept;
import in.nit.model.Employee;
import in.nit.repo.DeptRepository;
import in.nit.repo.EmployeeRepository;

@Component
@Order(11)
public class EmployeeTestRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	@Autowired
	private DeptRepository deptRepo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Employee(55, "A", 2.2, null)); //Valid, even best
		repo.save(new Employee(56, "B", 5.8, deptRepo.findByDeptId(10))); //Valid but not recomanded
		repo.save(new Employee(57, "C", 2.8, null));
		repo.save(new Employee(58, "D", 2.6, new Dept(12)));
	}

}


