package com.mukesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mukesh.controller.MainController;
import com.mukesh.vo.StudentVO;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=null;
		MainController controller=null;
		StudentVO vo=null;
		String result=null;
		
		ctx =SpringApplication.run(Application.class, args);
	//get ioc container
		controller=ctx.getBean("controller",MainController.class);
		vo=new StudentVO();
		vo.setSname("mukesh");
		vo.setSadd("delhi");
		vo.setM1("90");
		vo.setM2("95");
		vo.setM3("85");
		try {
			result=controller.handleStudent(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		ctx.close();
	
	}

}
