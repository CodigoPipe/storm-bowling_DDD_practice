package com.felipeGil.desafioddd.domain.ball_creation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.generics.EndDate;
import com.felipeGil.desafioddd.domain.generics.StartDate;

public class BallCreationCreated extends DomainEvent {

    private final StartDate startDate;

    private final EndDate endDate;

    public BallCreationCreated(StartDate startDate, EndDate endDate) {
        super("FelipeGil.BallCreation.BallCreationCreated");
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public StartDate getStartDate() {
        return startDate;
    }

    public EndDate getEndDate() {
        return endDate;
    }
}
