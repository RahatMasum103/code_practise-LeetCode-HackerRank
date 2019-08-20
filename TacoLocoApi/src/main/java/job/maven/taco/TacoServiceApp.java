package job.maven.taco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TacoServiceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * sets up default configuration
		 * strats Spring application context
		 * performs classpath scan
		 * starts tomcat server
		 */
		SpringApplication.run(TacoServiceApp.class, args); 

	}

}
