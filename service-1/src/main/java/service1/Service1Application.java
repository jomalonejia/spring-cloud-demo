package service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service1.mapper.CityMapper;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Service1Application {

	@Autowired
	private CityMapper cityMapper;

	// @Value("${name}")
	private String name;


	@GetMapping("/test")
	public String test(){
		return cityMapper.findByState("CA").toString();
	}

	@GetMapping("/test2")
	public String test2(){
		return name;
	}

	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}
}
