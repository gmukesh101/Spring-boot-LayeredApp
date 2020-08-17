package com.mukesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.mukesh.controller.MainController;
import com.mukesh.vo.StudentVO;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class Application {
	/*@Autowired
	private  Environment  env;
	
	
	@Bean(name="ds")
	public  DataSource  createDs()throws Exception {
		ComboPooledDataSource ds=new ComboPooledDataSource();
		ds.setDriverClass(env.getRequiredProperty("spring.datasource.driver-class-name"));
		ds.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
		ds.setUser(env.getRequiredProperty("spring.datasource.username"));
		ds.setPassword(env.getRequiredProperty("spring.datasource.password"));
		return ds;
		
	}*/
	

	public static void main(String[] args) {
		ConfigurableApplicationContext  ctx=null;
		MainController controller=null;
		StudentVO vo=null;
		String result=null;
		//Boot Strapping 
		ctx=SpringApplication.run(Application.class, args);
		//get IOC container
		controller =ctx.getBean("controller",MainController.class);
		//create vo class object
		vo=new StudentVO();
		vo.setSname("raja"); vo.setSadd("hyd"); vo.setM1("90"); vo.setM2("80"); vo.setM3("80");
		//invoke method
		try{
			result=controller.handleStudent(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//close container
		ctx.close();
	}

}
