package com.devsuperior.desafio1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	ShippingService shippingService;
	
	public double total(Order order){
		double discountedValue = (1 - order.getDicount()/100) * order.getBasic(); 
		order.setBasic(discountedValue);
		return shippingService.shipment(order);
	}
	
}
