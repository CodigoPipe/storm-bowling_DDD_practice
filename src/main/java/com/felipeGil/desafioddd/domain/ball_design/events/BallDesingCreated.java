package com.felipeGil.desafioddd.domain.ball_design.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_design.values.BallName;
import com.felipeGil.desafioddd.domain.ball_design.values.BallWeight;
import com.felipeGil.desafioddd.domain.generics.EndDate;
import com.felipeGil.desafioddd.domain.generics.StartDate;

public class BallDesingCreated extends DomainEvent {


    private final BallName ballName;

    private final BallWeight ballWeight;

    private final StartDate startDate;

    private final EndDate endDate;

    public BallDesingCreated(BallName ballName, BallWeight ballWeight, StartDate startDate, EndDate endDate) {
        super("FelipeGil.BallDesing.BallDesingCreated");
        this.ballName = ballName;
        this.ballWeight = ballWeight;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public BallName getBallName() {
        return ballName;
    }

    public BallWeight getBallWeight() {
        return ballWeight;
    }

    public StartDate getStartDate() {
        return startDate;
    }

    public EndDate getEndDate() {
        return endDate;
    }
}
