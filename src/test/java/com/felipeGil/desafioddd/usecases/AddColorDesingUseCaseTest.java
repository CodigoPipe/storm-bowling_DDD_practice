package com.felipeGil.desafioddd.usecases;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
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
class AddColorDesingUseCaseTest {

    private final String ROOT_ID = "33442033";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void AddColorDesingUseCaseTest() {
        var command = new AddColorDesing(BallDesingId.of(ROOT_ID), ColorDesingId.of("fdf45ht"), new ColorName("Black"), new Density(12));
        var useCase = new AddColorDesingUseCase();

        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new BallDesingCreated(
                        new BallName("300c"),
                        new BallWeight(16),
                        new StartDate("01/01/2027"),
                        new EndDate("05/08/2028")
                )
        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong Adding colorDesing"))
                .getDomainEvents();

        var event = (ColorDesingAdded)events.get(0);
        Assertions.assertEquals(command.getColorName().value(), event.getColorName().value());
        Assertions. assertEquals(command.getDensity().value(), event.getDensity().value());
        Mockito.verify(repository).getEventsBy(ROOT_ID);
    }

}