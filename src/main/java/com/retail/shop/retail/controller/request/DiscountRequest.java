package com.retail.shop.retail.controller.request;


import com.retail.shop.retail.models.Bill;
import com.retail.shop.retail.models.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiscountRequest {
	private User user;

    private Bill bill;
    
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}



}
