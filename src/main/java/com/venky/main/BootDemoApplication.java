package com.venky.main;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.venky.entity.Skill;
import com.venky.entity.User;
import com.venky.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackages= {"com.venky.repository"})
@EnableTransactionManagement
@EntityScan(basePackages= {"com.venky.entity"})
public class BootDemoApplication 
{
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) 
	{
		SpringApplication.run(BootDemoApplication.class, args);

	}
	
	/*@PostConstruct
	public void setupDbWithData(){
		User user= new User("Venky", "abc", null);
		user.setSkills(Arrays.asList(new Skill("java"), new Skill("js")));
		user= userRepository.save(user);
	}*/

}
