package in.nit.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class User {
	@Id
	private Integer userId;
	private String userFName;
	private String  userLName;
	
	@OneToMany
	@JoinColumn(name="userIdFk")
	private List<Goal> goalList;
}
