package fr.jibibi.springdockerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.jibibi.springdockerserver.beans.AppState;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringDockerServer {

	@Bean
	public AppState appState(){
		return new AppState();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerServer.class, args);
	}
}
