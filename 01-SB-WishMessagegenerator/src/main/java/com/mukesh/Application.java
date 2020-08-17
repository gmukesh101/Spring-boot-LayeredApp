package com.mukesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import com.mukesh.beans.WishMessageGenerator;

/**
 * @author mukesh
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext ctx = null;
		WishMessageGenerator generator = null;
		String msg = null;
		System.out.println("Main()");
		//get ioc container
		ctx = SpringApplication.run(Application.class, args);
		//get target bean class
		generator = ctx.getBean("wmg", WishMessageGenerator.class);
		// invoke b method
		msg = generator.generateWishMsg("Mukesh");
		System.out.println("Result is:" + msg);
		
		//close the container
		((ConfigurableApplicationContext) ctx).close();

	}

}
