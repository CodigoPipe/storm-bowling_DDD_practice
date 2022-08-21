package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.felipeGil.desafioddd.domain.ball_design.commands.AddCoreDesing;
import com.felipeGil.desafioddd.domain.ball_design.commands.AddCoverDesing;
import com.felipeGil.desafioddd.domain.ball_design.events.BallDesingCreated;
import com.felipeGil.desafioddd.domain.ball_design.events.CoreDesingAdded;
import com.felipeGil.desafioddd.domain.ball_design.events.CoverDesingAdded;
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
class AddCoverDesingUseCaseTest {

    private final String ROOT_ID = "45gt56";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void addCoverDesingUseCaseTest() {
        var command = new AddCoverDesing(BallDesingId.of(ROOT_ID), CoverDesingId.of("879944"), new CoverType("onixNewFire"), new ResponseTime(3), new Surface("new fire old G"));
        var useCase = new AddCoverDesingUseCase();

        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new BallDesingCreated(
                        new BallName("Onix"),
                        new BallWeight(9),
                        new StartDate("12/12/2021"),
                        new EndDate("09/08/2022")
                )
        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong Adding a the core desing"))
                .getDomainEvents();

        var event = (CoverDesingAdded)events.get(0);
        Assertions.assertEquals(command.getCoverType().value(), event.getCoverType().value());
        Assertions. assertEquals(command.getSurface().value(), event.getSurface().value());
        Assertions. assertEquals(command.getResponseTime().value(), event.getResponseTime().value());
        Mockito.verify(repository).getEventsBy(ROOT_ID);
    }
}