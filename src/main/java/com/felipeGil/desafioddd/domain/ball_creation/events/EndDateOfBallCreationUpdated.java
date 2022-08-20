package com.felipeGil.desafioddd.domain.ball_creation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.generics.EndDate;

public class EndDateOfBallCreationUpdated extends DomainEvent {

    private final EndDate endDate;

    public EndDateOfBallCreationUpdated(String type, EndDate endDate) {
        super("FelipeGil.BallCreation.EndDateOfBallCreationUpdated");
        this.endDate = endDate;
    }

    public EndDate getEndDate() {
        return endDate;
    }
}
