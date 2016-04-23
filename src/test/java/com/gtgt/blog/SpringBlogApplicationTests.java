package com.gtgt.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBlogApplication.class)
@WebAppConfiguration
public class SpringBlogApplicationTests {

	@Test
	public void contextLoads() {
	}

}
