package com.object.reservation.policy;

import com.object.reservation.Money;
import com.object.reservation.Screening;
import com.object.reservation.condition.DiscountCondition;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {

    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
