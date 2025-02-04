package com.j.hidden;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
public class HiddenGemsInJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiddenGemsInJavaApplication.class, args);
	}

	@Component
	public static class CommandLineExecutor implements CommandLineRunner {
		@Override
		public void run(String... args) throws Exception {
			System.out.println("Starting command line runner");
		}
	}

	@RestController("/")
	public static class TestRestController {

		@GetMapping
		public String get() {
			return "Hello World test me";
		}
	}

}
