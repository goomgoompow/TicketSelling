package com.object.reservation.policy;

import com.object.reservation.Money;
import com.object.reservation.Screening;
import com.object.reservation.condition.DiscountCondition;

public class PercentDiscountPolicy extends DiscountPolicy{
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
