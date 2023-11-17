package com.codecool.happyshipping;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = { "cors.allowed-origin-patterns=http://localhost:5173" })
class ServerApplicationTests {

	@Test
	void contextLoads() {
	}

}
