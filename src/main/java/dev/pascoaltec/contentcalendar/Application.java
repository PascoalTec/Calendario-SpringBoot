package dev.pascoaltec.contentcalendar;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.pascoaltec.contentcalendar.model.Content;
import dev.pascoaltec.contentcalendar.model.Status;
import dev.pascoaltec.contentcalendar.model.Type;
import dev.pascoaltec.contentcalendar.repository.ContentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository){
		return args -> {
			// inserir data dentro da database
			Content content = new Content(null,
                "Hello Chat GPT",
                "All about Chat GPT",
                Status.IDEA,
                Type.VIDEO,
                LocalDateTime.now(),
                null,
                "");

				repository.save(content);
		};
	}

}
