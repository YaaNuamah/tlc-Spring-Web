package turntabl.io.springwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import turntabl.io.springwebservices.model.Maths;

@EnableSwagger2
@SpringBootApplication
public class SpringWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebServicesApplication.class, args);
	}

	@Bean
	public Maths functions(){
		return new Maths();
	}
}
