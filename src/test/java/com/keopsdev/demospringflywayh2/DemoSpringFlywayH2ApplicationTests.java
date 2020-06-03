package com.keopsdev.demospringflywayh2;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

import com.keopsdev.demospringflywayh2.persistence.models.User;
import com.keopsdev.demospringflywayh2.persistence.repositories.UserRepository;


@SpringBootTest(classes = DemoSpringFlywayH2Application.class)
class DemoSpringFlywayH2ApplicationTests {

	@Autowired
	UserRepository userRepository;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void contexLoads() throws Exception {
		assertThat(userRepository).isNotNull();
	}
	
	@Test
	void findAllTest() {
		List<User> users = userRepository.findAll();
		assertThat(users.size() > 0);
	}

}
