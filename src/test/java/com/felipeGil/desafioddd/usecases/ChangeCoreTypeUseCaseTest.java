package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.felipeGil.desafioddd.domain.ball_design.commands.ChangeCoreType;
import com.felipeGil.desafioddd.domain.ball_design.events.BallDesingCreated;
import com.felipeGil.desafioddd.domain.ball_design.events.ColorNameChanged;
import com.felipeGil.desafioddd.domain.ball_design.events.CoreDesingAdded;
import com.felipeGil.desafioddd.domain.ball_design.events.CoreTypeChanged;
import com.felipeGil.desafioddd.domain.ball_design.values.*;
import com.felipeGil.desafioddd.domain.generics.EndDate;
import com.felipeGil.desafioddd.domain.generics.StartDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;


@ExtendWith(MockitoExtension.class)
class ChangeCoreTypeUseCaseTest {

    private final String ROOT_ID = "29345";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void changeCoreTypeUseCaseTest(){
        var command = new ChangeCoreType(BallDesingId.of(ROOT_ID), CoreDesingId.of("4334"), new CoreType("Rst-x1"));
        var useCase = new ChangeCoreTypeUseCase();
        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new BallDesingCreated(
                        new BallName("Iq tour"),
                        new BallWeight(11),
                        new StartDate("03/011/2001"),
                        new EndDate("02/11/2002")
                ),
                new CoreDesingAdded(
                        CoreDesingId.of("4334"),
                        new CoreType("Uc-3"),
                        new CoreSize(1100)
                )
        ));
        useCase.addRepository(repository);
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong changing the core size"))
                .getDomainEvents();

        var event = (CoreTypeChanged)events.get(0);
        Assertions.assertEquals(command.getCoreType().value(), event.getCoreType().value());
        Mockito.verify(repository).getEventsBy(ROOT_ID);
    }
}