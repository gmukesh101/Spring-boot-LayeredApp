package in.nit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nit.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("SELECT e.empName,d.deptCode FROM Employee e INNER JOIN e.deptOb as d")
	//@Query("SELECT e.empName,d.deptCode FROM Employee e LEFT OUTER JOIN e.deptOb as d")
	//@Query("SELECT e.empName,d.deptCode FROM Employee e RIGHT OUTER JOIN e.deptOb as d")
	//@Query("SELECT e.empName,d.deptCode FROM Employee e FULL OUTER JOIN e.deptOb as d")
	List<Object[]> getEmpNameandDeptCode();
	
	@Query("SELECT e.empName,d.deptCode FROM Employee e INNER JOIN e.deptOb as d where e.empId=:empId")
	Object getEmpNameandDeptCodeById(Integer empId);
}
