package gmail.com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {


	public static void double getRandomTicketNumber (){
		double min=1000;
		double max=9999;
		double x = (int) (Math.random() * ((max-min)+1))+min;
		return x;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
