package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.entities.Livro;
import com.example.demo.repository.LivroRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private LivroRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Livro l1 = new Livro(null, "Timão campanha Libertadores 2012", "Marcelo Tchelo", 2013);
		Livro l2 = new Livro(null, "Campanha Corinthians CDB 2025", "Marcelo Tchelo", 2026);
		
		repository.saveAll(Arrays.asList(l1, l2));
	
	}
	
}
