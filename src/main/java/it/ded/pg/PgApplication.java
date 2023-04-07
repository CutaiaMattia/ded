package it.ded.pg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class PgApplication {


	public static void main(String[] args) throws IOException {
		SpringApplication.run(PgApplication.class, args);
	}

}
