package com.scheduledtask.scheduledtask;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class ScheduledTaskApplication {

	Logger logger = (Logger) LoggerFactory.getLogger(ScheduledTaskApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(ScheduledTaskApplication.class, args);
	}

	@Scheduled(fixedDelay = 2000L, initialDelay = 2000L)
	public void job() throws InterruptedException {
		logger.info("Job Current Time" + new Date());
		Thread.sleep(1000L);
	}
}