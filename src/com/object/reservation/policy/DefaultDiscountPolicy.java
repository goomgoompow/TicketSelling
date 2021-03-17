package com.object.reservation.policy;

import com.object.reservation.Money;
import com.object.reservation.Screening;
import com.object.reservation.condition.DiscountCondition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy{

    private List<DiscountCondition> conditions = new ArrayList<>();



    public DefaultDiscountPolicy(DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return null;
    }

    abstract Money getDiscountAmount(Screening screening);

}
