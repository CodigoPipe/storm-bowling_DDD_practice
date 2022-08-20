package com.felipeGil.desafioddd.domain.ball_creation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.generics.StartDate;

public class StartDateOfBallCreationFixed extends DomainEvent {

    private final StartDate startDate;

    public StartDateOfBallCreationFixed(StartDate startDate) {
        super("FelipeGil.BallCreation.StartDateOfBallCreationFixed");
        this.startDate = startDate;
    }

    public StartDate getStartDate() {
        return startDate;
    }
}
