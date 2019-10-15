package com.joe.scraper.zillowScraper;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ZillowScraperApplication {
	final static Logger logger = Logger.getLogger(ZillowScraperApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ZillowScraperApplication.class, args);
		logger.info("test");
	}

}
