package br.edu.tagarelas;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TagarelasApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(TagarelasApplication.class, args);
		System.out.println ("Processando Tagarelas Application");
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
	}
}
