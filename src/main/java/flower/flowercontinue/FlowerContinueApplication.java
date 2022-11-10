package flower.flowercontinue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class FlowerContinueApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowerContinueApplication.class, args);
	}

}
