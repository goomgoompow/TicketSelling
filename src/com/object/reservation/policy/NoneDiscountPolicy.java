package com.object.reservation.policy;

import com.object.reservation.Money;
import com.object.reservation.Screening;

public class NoneDiscountPolicy implements DiscountPolicy{

    /*@Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }*/

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
