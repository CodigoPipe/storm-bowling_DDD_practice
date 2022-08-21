package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.felipeGil.desafioddd.domain.ball_creation.BallCreation;
import com.felipeGil.desafioddd.domain.ball_creation.events.BallCreationCreated;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallCreationId;
import com.felipeGil.desafioddd.domain.generics.events.NotificationSent;

public class NotifyDesingToEmployeeUseCase extends UseCase<TriggeredEvent<BallCreationCreated>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<BallCreationCreated> ballCreationCreatedTriggeredEvent) {
        var event = ballCreationCreatedTriggeredEvent.getDomainEvent();
        var ballCreation = BallCreation.from(BallCreationId.of(event.aggregateRootId()),this.retrieveEvents());
        ballCreation.notifyDesingToEmployees("The desing is ready to star the creation");
        emit().onResponse(new ResponseEvents(ballCreation.getUncommittedChanges()));
    }
}
