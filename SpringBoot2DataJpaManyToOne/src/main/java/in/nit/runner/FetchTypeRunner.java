package in.nit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import in.nit.repo.EmployeeRepository;

@Component
@Order(12)
public class FetchTypeRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		//select(Fetching)
		//Optional<Employee>  opt = repo.findById(55); 		System.out.println("OK");
		
		List<Object[]> list=repo.getEmpNameandDeptCode();
		for(Object[] ob:list ) {
			System.out.println(ob[0]+"-"+ob[1]);
		}
		System.out.println("----------------------------");
		Object[] ob=(Object[])repo.getEmpNameandDeptCodeById(56);
		System.out.println(ob[0]+"-"+ob[1]);
	}

}
