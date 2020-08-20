package in.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import in.nit.model.Dept;
import in.nit.repo.DeptRepository;

@Component
@Order(10)
public class DeptTestRunner implements CommandLineRunner {
	@Autowired
	private DeptRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Dept(10, "DEV", "ONE"));
		repo.save(new Dept(11, "QA", "TWO"));
		repo.save(new Dept(12, "BA", "THREE"));
	}

}

