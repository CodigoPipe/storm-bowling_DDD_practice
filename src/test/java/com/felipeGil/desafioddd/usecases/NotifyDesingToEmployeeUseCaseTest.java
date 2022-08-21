package com.felipeGil.desafioddd.usecases;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import com.felipeGil.desafioddd.domain.ball_creation.events.BallCreationCreated;
import com.felipeGil.desafioddd.domain.ball_design.values.BallDesingId;
import com.felipeGil.desafioddd.domain.generics.EndDate;
import com.felipeGil.desafioddd.domain.generics.StartDate;
import com.felipeGil.desafioddd.domain.generics.events.NotificationSent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class NotifyDesingToEmployeeUseCaseTest {

    private final String ROOT_ID = "fg4556";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void notifyDesingToEmployeeUseCaseTest(){

        var event = new BallCreationCreated(new StartDate("04/06/2020"), new EndDate("04/09/2020"), new BallDesingId());
        event.setAggregateRootId(ROOT_ID);
        var useCase = new NotifyDesingToEmployeeUseCase();

        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(event));

        useCase.addRepository(repository);
        var events = UseCaseHandler
                .getInstance().setIdentifyExecutor(ROOT_ID)
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong sending the Message"))
                .getDomainEvents();

        NotificationSent responseEvent = (NotificationSent) events.get(0);
        Assertions.assertEquals(responseEvent.getMessage(), "The desing is ready to star the creation");
        Mockito.verify(repository).getEventsBy(ROOT_ID);
    }

}