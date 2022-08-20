package com.felipeGil.desafioddd.domain.ball_design.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_design.values.BallWeight;

public class BallWeightDecreased extends DomainEvent {

    private final BallWeight ballWeight;

    public BallWeightDecreased(BallWeight ballWeight) {
        super("FelipeGil.BallDesing.BallWeightDecreased");
        this.ballWeight = ballWeight;
    }

    public BallWeight getBallWeight() {
        return ballWeight;
    }
}
