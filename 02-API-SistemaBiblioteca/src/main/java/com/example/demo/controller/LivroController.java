package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Livro;
import com.example.demo.service.LivroService;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@GetMapping
	public List<Livro> findAll() {
		return livroService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Livro> findById(@PathVariable Long id) { // recebe o ID da URL
		
		Livro livro = livroService.findById(id); // chama o service para busca o livro
		
		return ResponseEntity.ok(livro); // retorna 200 OK com o livro encontrado
		
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id) { // recebe o ID da URL
		
		livroService.deleteById(id); // chama o service para deletar o livro
		
		// noContent = informa ao cliente que a operação foi concluída com sucesso e não há conteúdo para retornar.
		return ResponseEntity.noContent().build(); // deleta com sucesso e retorna 204 noContent
		
	}
}
