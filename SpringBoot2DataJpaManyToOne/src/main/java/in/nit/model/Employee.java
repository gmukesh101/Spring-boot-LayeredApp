package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Employee {
	@Id
	@NonNull
	private Integer empId;
	private String empName;
	private Double empSal;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="didFk")
	private Dept deptOb; //HAS-A
}

