package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.felipeGil.desafioddd.domain.ball_design.commands.ChangeColorName;
import com.felipeGil.desafioddd.domain.ball_design.events.BallDesingCreated;
import com.felipeGil.desafioddd.domain.ball_design.events.ColorDesingAdded;
import com.felipeGil.desafioddd.domain.ball_design.events.ColorNameChanged;
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
class ChangeColorNameUseCaseTest {

    private final String ROOT_ID = "564573";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void changeColorNameUseCaseTest(){
        var command = new ChangeColorName(BallDesingId.of(ROOT_ID), ColorDesingId.of("676745"), new ColorName("Blue"));
        var useCase = new ChangeColorNameUseCase();
        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new BallDesingCreated(
                        new BallName("Reality"),
                        new BallWeight(15),
                        new StartDate("02/02/2020"),
                        new EndDate("05/05/2022")
                ),
                new ColorDesingAdded(
                        ColorDesingId.of("676745"),
                        new ColorName("amarillo"),
                        new Density(66)
                )
        ));
        useCase.addRepository(repository);
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong changing melodic instrument"))
                .getDomainEvents();

        var event = (ColorNameChanged)events.get(0);
        Assertions.assertEquals(command.getColorName().value(), event.getColorName().value());
        Mockito.verify(repository).getEventsBy(ROOT_ID);
    }

}