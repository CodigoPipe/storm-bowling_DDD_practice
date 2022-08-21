package com.felipeGil.desafioddd.domain.ball_design;

import co.com.sofka.domain.generic.EventChange;
import com.felipeGil.desafioddd.domain.ball_design.events.BallDesingCreated;

public class BallDesingChange extends EventChange {

    public BallDesingChange(BallDesing ballDesing) {
        apply((BallDesingCreated event) -> {
            ballDesing.ballName = event.getBallName();
            ballDesing.ballWeight = event.getBallWeight();
            ballDesing.startDate = event.getStartDate();
            ballDesing.endDate = event.getEndDate();
        });





    }


}
