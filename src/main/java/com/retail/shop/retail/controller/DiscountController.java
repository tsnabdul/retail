package com.retail.shop.retail.controller;

import com.retail.shop.retail.controller.request.DiscountRequest;
import com.retail.shop.retail.services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("api/v1/discounts")
public class DiscountController {

    @Autowired
    private DiscountService discountService;

    @PostMapping
    public BigDecimal createDiscount(@RequestBody DiscountRequest request) {
        return discountService.discountCalculation(request.getUser(), request.getBill());
    }

}
