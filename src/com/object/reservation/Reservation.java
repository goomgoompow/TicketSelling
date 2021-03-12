package com.object.reservation;

public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money money;
    private int audienceCount;

    public Reservation(Customer customer, Screening screening, Money money, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.money = money;
        this.audienceCount = audienceCount;
    }
}
