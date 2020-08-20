package in.nit.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nit.model.User;
import in.nit.repo.GoalRepository;
import in.nit.repo.UserRepository;

@Component
public class UserTestRunner implements CommandLineRunner {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private GoalRepository goalRepo;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setUserId(900);
		user.setUserFName("Mukesh");
		user.setUserLName("sah");
		user.setGoalList(
				Arrays.asList(
						goalRepo.findByGoalId(101),
						goalRepo.findByGoalId(103)
						)
				);
		
		
		repo.save(user);
		
	}
}



