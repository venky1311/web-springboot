package com.venky.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
/*@EnableJpaRepositories(basePackages= {"com.venky.repository"})
@EnableTransactionManagement
@EntityScan(basePackages= {"com.venky.entity"})*/
public class BootDemoApplication 
{

	public static void main(String[] args) 
	{
		  SpringApplication.run(BootDemoApplication.class, args);
		}
}
