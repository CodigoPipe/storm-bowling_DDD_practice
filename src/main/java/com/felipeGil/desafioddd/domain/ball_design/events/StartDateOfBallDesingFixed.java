package com.felipeGil.desafioddd.domain.ball_design.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.generics.StartDate;

public class StartDateOfBallDesingFixed extends DomainEvent {

    private final StartDate startDate;

    public StartDateOfBallDesingFixed(StartDate startDate) {
        super("FelipeGil.BallDesing.StartDateOfBallDesingFixed");
        this.startDate = startDate;
    }

    public StartDate getStartDate() {
        return startDate;
    }

}
