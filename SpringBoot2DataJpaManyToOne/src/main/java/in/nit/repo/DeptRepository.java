package in.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nit.model.Dept;

public interface DeptRepository extends JpaRepository<Dept, Integer>{

	Dept findByDeptId(Integer deptId);
	
}
