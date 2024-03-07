package com.demo.sprintbootdemoactuator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {

	private static final Logger logger = LoggerFactory.getLogger(LoggerController.class);

	@GetMapping("/log/{id}")
	public String getLogger(@PathVariable int id) {
		if (id == 1) {
			logger.info("[info] Loggers are printing");
			return "success";
		} else {
			logger.info("[info] Something wrong");
			logger.debug("[debug] Loggers are debugging");
			return "Failure";
		}
	}
}
