package pl.socodeit.salesforceintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SalesforceIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesforceIntegrationApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
