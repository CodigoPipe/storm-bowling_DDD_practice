package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.felipeGil.desafioddd.domain.ball_design.commands.AddColorDesing;
import com.felipeGil.desafioddd.domain.ball_design.commands.AddCoreDesing;
import com.felipeGil.desafioddd.domain.ball_design.events.BallDesingCreated;
import com.felipeGil.desafioddd.domain.ball_design.events.ColorDesingAdded;
import com.felipeGil.desafioddd.domain.ball_design.events.CoreDesingAdded;
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

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AddCoreDesingUseCaseTest {

    private final String ROOT_ID = "z34zs";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void addCoreDesingUseCaseTest() {
        var command = new AddCoreDesing(BallDesingId.of(ROOT_ID), CoreDesingId.of("879944"), new CoreType("Old Solid 33"), new CoreSize(2450));
        var useCase = new AddCoreDesingUseCase();

        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new BallDesingCreated(
                        new BallName("Ideal Pro"),
                        new BallWeight(13),
                        new StartDate("01/01/2024"),
                        new EndDate("09/08/2026")
                )
        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong Adding a the core desing"))
                .getDomainEvents();

        var event = (CoreDesingAdded)events.get(0);
        Assertions.assertEquals(command.getCoreSize().value(), event.getCoreSize().value());
        Assertions. assertEquals(command.getCoreType().value(), event.getCoreType().value());
        Mockito.verify(repository).getEventsBy(ROOT_ID);
    }

}