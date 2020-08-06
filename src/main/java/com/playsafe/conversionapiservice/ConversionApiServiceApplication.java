package com.playsafe.conversionapiservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConversionApiServiceApplication implements CommandLineRunner  {

	private static final Logger LOG = LoggerFactory.getLogger(ConversionApiServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConversionApiServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		LOG.info("###################################################################################################");
		LOG.info("        Service capable of serving scale conversion Application command-line initiated             ");
		LOG.info("###################################################################################################");
	}

	/**
	 * The Class RESTController.
	 */
	@RestController
	class RESTController {

		/**
		 * Hello.
		 *
		 * @return the string
		 */
		@GetMapping("/")
		public String activatedApp() {
			return "<H1>Service capable of serving scale conversion Application</H1>";
		}
	}
}
