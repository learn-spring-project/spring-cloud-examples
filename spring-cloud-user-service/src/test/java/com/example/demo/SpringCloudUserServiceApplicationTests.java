package com.example.demo;

import com.example.demo.user.entity.User;
import com.example.demo.user.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes ={ SpringCloudUserServiceApplication.class})
@Configuration
@ComponentScan(basePackages =  "com.example.demo")
public class SpringCloudUserServiceApplicationTests {

	@Autowired
	@Qualifier(value = "userRepository")
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void test()
	{
		List<User> user = userRepository.findByAddress("北京");
		System.out.println(user.toString());
	}

}
