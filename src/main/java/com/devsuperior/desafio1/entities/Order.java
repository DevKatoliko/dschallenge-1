package com.devsuperior.desafio1.entities;

public class Order {
	
	private Integer code;
	private Double basic;
	private Double dicount;
	
	
	public Order() {
		
	}

	public Order(Integer code, Double basic, Double dicount) {
		this.code = code;
		this.basic = basic;
		this.dicount = dicount;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Double getBasic() {
		return basic;
	}

	public void setBasic(Double basic) {
		this.basic = basic;
	}

	public Double getDicount() {
		return dicount;
	}

	public void setDicount(Double dicount) {
		this.dicount = dicount;
	}
	
	

}
