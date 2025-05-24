package com.devsuperior.desafio1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio1.entities.Order;
import com.devsuperior.desafio1.services.OrderService;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner{
	@Autowired
	OrderService orderService;
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}
	
	@Override
	public void run(String...Args) throws Exception {
		List.of(new Order(1034,150.0,20.0),
				new Order(2280,800.0,10.0),
				new Order(1308,95.90,0.0)
				).forEach(order -> {
					String out = "Pedido código " + order.getCode() +
								 "\nValor total: R$ " + orderService.total(order) + "\n";
					System.out.println(out);
				});;
		
	}
}
