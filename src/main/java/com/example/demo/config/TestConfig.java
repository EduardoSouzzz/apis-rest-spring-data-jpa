package com.example.demo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entities.Cliente;
import com.example.demo.entities.Pedido;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.PedidoRepository;

@Configuration
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	public void run(String... args) throws Exception {
		Cliente c1 = new Cliente(null, "Carlos", "carlos1980@gmail.com");
		Cliente c2 = new Cliente(null, "Maria", "mmaria99@gmail.com");
		Cliente c3 = new Cliente(null, "Brenda", "brendaa2006@gmail.com");
		
		Pedido p1 = new Pedido(null, Instant.parse("2024-01-15T10:30:23Z"), 199.89,  c2);
		Pedido p2 = new Pedido(null, Instant.parse("2025-07-19T16:59:56Z"), 643.10, c3);
		Pedido p3 = new Pedido(null, Instant.parse("2025-03-10T21:12:14Z"), 253.79, c1);
		
		clienteRepository.saveAll(Arrays.asList(c1, c2, c3));
		pedidoRepository.saveAll(Arrays.asList(p1, p2, p3));
	}

}
