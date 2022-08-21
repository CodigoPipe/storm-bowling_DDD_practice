package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.felipeGil.desafioddd.domain.ball_creation.BallCreation;
import com.felipeGil.desafioddd.domain.ball_creation.events.DrillingMachineAdded;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallCreationId;

public class NotifyEmployeeMachineReadyUseCase extends UseCase<TriggeredEvent<DrillingMachineAdded>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<DrillingMachineAdded> drillingMachineAddedTriggeredEvent) {
        var event = drillingMachineAddedTriggeredEvent.getDomainEvent();
        var ballCreation = BallCreation.from(BallCreationId.of(event.aggregateRootId()),this.retrieveEvents());
        ballCreation.notifyEmployeeMachineReady("The Employee has been assigned to this drilling machine");
        emit().onResponse(new ResponseEvents(ballCreation.getUncommittedChanges()));
    }

}
