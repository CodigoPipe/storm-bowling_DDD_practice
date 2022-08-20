package com.felipeGil.desafioddd.domain.ball_design.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.generics.EndDate;

public class EndDateOfBallDesingUpdated extends DomainEvent {

    private final EndDate endDate;

    public EndDateOfBallDesingUpdated(EndDate endDate) {
        super("FelipeGil.BallDesing.EndDateOfBallDesingFixed");
        this.endDate = endDate;
    }

    public EndDate getEndDate() {
        return endDate;
    }
}
