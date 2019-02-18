package com.boot.springbootchapter1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Springbootchapter1ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@LocalServerPort
	private int port;
	private URL base;

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Before
	public void setUp() throws MalformedURLException {
		this.base = new URL("http://localhost:" + port + "/springbootchapter1/demo1");
	}

	@Test
	public void demo1() {
		ResponseEntity responseEntity = testRestTemplate.getForEntity(base.toString(),String.class);
		assertEquals(responseEntity.getBody(),"hello bro");
	}


}
