package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.felipeGil.desafioddd.domain.ball_design.commands.ChangeCoreType;
import com.felipeGil.desafioddd.domain.ball_design.commands.ChangeCoverType;
import com.felipeGil.desafioddd.domain.ball_design.events.*;
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
class ChangeCoverTypeUseCaseTest {

    private final String ROOT_ID = "ff3445";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void changeCoverTypeUseCaseTest(){
        var command = new ChangeCoverType(BallDesingId.of(ROOT_ID), CoverDesingId.of("tt5656"), new CoverType("Rex-PearlReactive"));
        var useCase = new ChangeCoverTypeUseCase();
        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new BallDesingCreated(
                        new BallName("Parallax"),
                        new BallWeight(14),
                        new StartDate("04/11/2012"),
                        new EndDate("02/11/2013")
                ),
                new CoverDesingAdded(
                        CoverDesingId.of("4334"),
                        new CoverType("Dark Solid"),
                        new ResponseTime(8),
                        new Surface("polished 1200")
                )
        ));
        useCase.addRepository(repository);
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong changing the cover type"))
                .getDomainEvents();

        var event = (CoverTypeChanged)events.get(0);
        Assertions.assertEquals(command.getCoverType().value(), event.getCoverType().value());
        Mockito.verify(repository).getEventsBy(ROOT_ID);
    }
}