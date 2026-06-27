package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Livro;
import com.example.demo.repository.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;
	
	public List<Livro> findAll(){
		return livroRepository.findAll();
	}
	
	public Livro findById(Long id) {
		return livroRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("Livro não encontrado."));
	}
	
	public void deleteById(Long id) {
		Livro obj = livroRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("Livro não encontrado."));
		
		livroRepository.delete(obj);
	}
}
