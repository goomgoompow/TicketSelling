package com.object.reservation.condition;

import com.object.reservation.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
