package com.devsuperior.desafio1.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class ShippingService {
	
	public double shipment(Order order) {
		if(order.getBasic() >= 200) {
			return order.getBasic();
		}else if(order.getBasic() < 100) {
			return order.getBasic() + 20;
		}else { 
			return order.getBasic() + 12;
		}
	};
}
