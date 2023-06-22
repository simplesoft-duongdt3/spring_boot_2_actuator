package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
//@EnableWebSecurity
@SpringBootApplication
public class DemoApplication {

//	@Bean
//	public SecurityWebFilterChain securityWebFilterChain(
//			ServerHttpSecurity http) {
//		return http.authorizeExchange()
//				.pathMatchers("/actuator/**").permitAll()
//				.anyExchange().authenticated()
//				.and().build();
//	}

	@Configuration
// @Profile("actuator-endpoints")
// if you want: register bean only if profile is set
	public class HttpTraceActuatorConfiguration {

		@Bean
		public HttpTraceRepository httpTraceRepository() {
			return new InMemoryHttpTraceRepository();
		}

	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
