/**
 * 
 */
package com.coderguide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @author gaurav.singh
 *
 */
@Configuration
@SpringBootApplication
public class RunApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(RunApplication.class, args);
	}

}
