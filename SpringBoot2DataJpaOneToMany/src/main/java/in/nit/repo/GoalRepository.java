package in.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.model.Goal;

public interface GoalRepository extends JpaRepository<Goal, Integer> {

	Goal findByGoalId(Integer goalId);
	
}
