package com.felipeGil.desafioddd.domain.ball_design.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.felipeGil.desafioddd.domain.ball_design.values.BallWeight;

public class BallWeightIncreased  extends DomainEvent {

    private final BallWeight ballWeight;

    public BallWeightIncreased(BallWeight ballWeight) {
        super("FelipeGil.BallDesing.BallWeightIncreased");
        this.ballWeight = ballWeight;
    }

    public BallWeight getBallWeight() {
        return ballWeight;
    }

}
