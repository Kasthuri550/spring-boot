package com.demo.springbootyamlfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(value = { "classpath:application.yml" },factory = YamlPropertySourceFactory.class)
public class YamlController {
	
	@Autowired
	private ConfigurableApplicationContext applicationContext;
	
	@Autowired
	private Environment environment;
	
	@Value("${server.port}")
	private int serverPort;
		
	@GetMapping("/config")
	public int getConfig()
	{
		return serverPort;
	}
	
	@GetMapping("/bean-names")
	public String[] getBeanNames()
	{
		return applicationContext.getBeanDefinitionNames();
	}
	
	@GetMapping("/port")
	public String getEnvironment()
	{
		String port = environment.getProperty("server.port");
		return port;
	}
	
}
