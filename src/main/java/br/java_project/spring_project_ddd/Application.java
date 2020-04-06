package br.java_project.spring_project_ddd;

import br.java_project.spring_project_ddd.domain.application.FirstLoad;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // that is @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {

	public static void main(String[] args) {

		if (FakeBanco.getAlunos().isEmpty()){
			FirstLoad.run();
		}

		SpringApplication.run(Application.class, args);

	}
}
