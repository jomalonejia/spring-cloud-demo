package com.service;

import com.service.domain.City;
import com.service.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Service1Application {

	@Autowired
	private CityMapper cityMapper;

	@GetMapping("/test")
	public String test(){
		return cityMapper.findByState("CA").toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}
}
