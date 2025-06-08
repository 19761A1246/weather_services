package com.example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
@Slf4j
class WeatherServicesApplicationTests {

	@Test
	void contextLoads() {
		log.info("test case executing..");
        assertTrue(true);
	}
}
