package in.nit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.model.Goal;
import in.nit.repo.GoalRepository;

@Component
public class GoalTestRunner implements CommandLineRunner {
	@Autowired
	private GoalRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		//updating the record..
		repo.save(new Goal(101, "withdraw", "ok"));
		repo.save(new Goal(102, "deposite", "ok"));
		repo.save(new Goal(103, "transfer", "ok"));
		
		
	}

}
