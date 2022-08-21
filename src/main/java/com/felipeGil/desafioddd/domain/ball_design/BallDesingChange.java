package com.felipeGil.desafioddd.domain.ball_design;

import co.com.sofka.domain.generic.EventChange;
import com.felipeGil.desafioddd.domain.ball_design.events.*;

public class BallDesingChange extends EventChange {

    public BallDesingChange(BallDesing ballDesing) {
        apply((BallDesingCreated event) -> {
            ballDesing.ballName = event.getBallName();
            ballDesing.ballWeight = event.getBallWeight();
            ballDesing.startDate = event.getStartDate();
            ballDesing.endDate = event.getEndDate();
        });

        apply((BallNameChanged event) -> ballDesing.changeBallName(event.getBallName()));

        apply((BallWeightDecreased event) -> ballDesing.decreaseBallWeight(event.getBallWeight()));

        apply((BallWeightIncreased event) -> ballDesing.increaseBallWeight(event.getBallWeight()));

        apply((ColorDesingAdded event) -> ballDesing.colorDesing = new ColorDesing(event.getColorDesingId(), event.getColorName(), event.getDensity()));

        apply((ColorNameChanged event) -> ballDesing.colorDesing.changeColorName(event.getColorName()));

        apply((CoreDesingAdded event) -> ballDesing.coreDesing = new CoreDesing(event.getCoreDesingId(), event.getCoreType(), event.getCoreSize()));

        //no me sale este metodo
        apply((CoreSizeDecreased event) -> ballDesing.coreDesing.increaseCoreSize(event.getCoreSize()));

        apply((CoreSizeIncreased event) -> ballDesing.coreDesing.increaseCoreSize(event.getCoreSize()));

        apply((CoreTypeChanged event) -> ballDesing.coreDesing.changeCoreType(event.getCoreType()));

        apply((CoverDesingAdded event) -> ballDesing.coverDesing = new CoverDesing(event.getCoverDesingId(), event.getCoverType(), event.getResponseTime(), event.getSurface()));

        apply((CoverTypeChanged event) -> ballDesing.coverDesing.changeCoverType(event.getCoverType()));

        apply((DensityDecreased event) -> ballDesing.colorDesing.decreaseDensity(event.getDensity()));

        apply((DensityIncreased event) -> ballDesing.colorDesing.increaseDensity(event.getDensity()));

        apply((EndDateOfBallDesingUpdated event) -> ballDesing.updateEndDateOfBallDesing(event.getEndDate()));

        apply((ResponseTimeDecreased event) -> ballDesing.coverDesing.decreaseResponseTime(event.getResponseTime()));

        apply((ResponseTimeIncreased event) -> ballDesing.coverDesing.increaseResponseTime(event.getResponseTime()));

        apply((StartDateOfBallDesingFixed event) -> ballDesing.fixStartDateOfBallDesing(event.getStartDate()));

        apply((SurfaceChanged event) -> ballDesing.coverDesing.changeSurface(event.getSurface()));

    }


}
