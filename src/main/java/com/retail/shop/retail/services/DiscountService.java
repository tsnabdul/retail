package com.retail.shop.retail.services;

import java.math.BigDecimal;

import com.retail.shop.retail.models.Bill;
import com.retail.shop.retail.models.User;

/**
 * This is the Discount interface file
 */
public interface DiscountService {

    /**
     * This method calculate discount for given user and bill
     * @param user  - User
     * @param bill - Bill
     * @return Double - payable amount for the user
     */
    BigDecimal discountCalculation(User user, Bill bill);
}
