package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.felipeGil.desafioddd.domain.ball_creation.commands.AddCompactingMachine;
import com.felipeGil.desafioddd.domain.ball_creation.events.BallCreationCreated;
import com.felipeGil.desafioddd.domain.ball_creation.events.CompactingMachineAdded;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallCreationId;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallSize;
import com.felipeGil.desafioddd.domain.ball_creation.values.CompactingMachineId;
import com.felipeGil.desafioddd.domain.ball_creation.values.Material;
import com.felipeGil.desafioddd.domain.ball_design.commands.AddColorDesing;
import com.felipeGil.desafioddd.domain.ball_design.events.BallDesingCreated;
import com.felipeGil.desafioddd.domain.ball_design.events.ColorDesingAdded;
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
class AddCompactingMachineUseCaseTest {


    private final String ROOT_ID = "ju5523";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void addColorDesingUseCaseTest() {
        var command = new AddCompactingMachine(BallCreationId.of(ROOT_ID), CompactingMachineId.of("cand858"), new BallSize("Big2"), new Material("sintetic23"));
        var useCase = new AddCompactingMachineUseCase();

        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new BallCreationCreated(
                        new StartDate("02/08/2025"),
                        new EndDate("02/06/2026")
                )
        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong Adding the compacting machine"))
                .getDomainEvents();

        var event = (CompactingMachineAdded)events.get(0);
        Assertions.assertEquals(command.getBallSize().value(), event.getBallSize().value());
        Assertions. assertEquals(command.getMaterial().value(), event.getMaterial().value());
        Mockito.verify(repository).getEventsBy(ROOT_ID);
    }
}