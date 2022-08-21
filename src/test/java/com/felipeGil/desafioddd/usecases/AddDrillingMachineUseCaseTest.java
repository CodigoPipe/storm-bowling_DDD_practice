package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.felipeGil.desafioddd.domain.ball_creation.commands.AddDrillingMachine;
import com.felipeGil.desafioddd.domain.ball_creation.events.BallCreationCreated;
import com.felipeGil.desafioddd.domain.ball_creation.events.DrillingMachineAdded;
import com.felipeGil.desafioddd.domain.ball_creation.values.*;
import com.felipeGil.desafioddd.domain.ball_design.values.BallDesingId;
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
class AddDrillingMachineUseCaseTest {

    private final String ROOT_ID = "jh3343";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void addDrillingMachineUseCaseTest() {
        var command = new AddDrillingMachine(BallCreationId.of(ROOT_ID), DrillingMachineId.of("122213"), new HoleSize(1), new NumerOfHoles(4));
        var useCase = new AddDrillingMachineUseCase();

        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new BallCreationCreated(
                        new StartDate("04/08/2021"),
                        new EndDate("02/06/2022"),
                        new BallDesingId()
                )
        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong Adding the drilling machine"))
                .getDomainEvents();

        var event = (DrillingMachineAdded)events.get(0);
        Assertions.assertEquals(command.getHoleSize().value(), event.getHoleSize().value());
        Assertions. assertEquals(command.getNumerOfHoles().value(), event.getNumerOfHoles().value());
        Mockito.verify(repository).getEventsBy(ROOT_ID);
    }
}