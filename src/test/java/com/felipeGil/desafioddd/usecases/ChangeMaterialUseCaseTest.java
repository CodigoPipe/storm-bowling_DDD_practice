package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.felipeGil.desafioddd.domain.ball_creation.commands.ChangeMaterial;
import com.felipeGil.desafioddd.domain.ball_creation.events.BallCreationCreated;
import com.felipeGil.desafioddd.domain.ball_creation.events.CompactingMachineAdded;
import com.felipeGil.desafioddd.domain.ball_creation.events.MaterialChanged;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallCreationId;
import com.felipeGil.desafioddd.domain.ball_creation.values.BallSize;
import com.felipeGil.desafioddd.domain.ball_creation.values.CompactingMachineId;
import com.felipeGil.desafioddd.domain.ball_creation.values.Material;
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
class ChangeMaterialUseCaseTest {

    private final String ROOT_ID = "666789";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void changeMaterialUseCaseTest(){
        var command = new ChangeMaterial(BallCreationId.of(ROOT_ID), CompactingMachineId.of("fgt56"), new Material("Urethane"));
        var useCase = new ChangeMaterialUseCase();
        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new BallCreationCreated(
                        new StartDate("01/11/2015"),
                        new EndDate("23/09/2015")
                ),
                new CompactingMachineAdded(
                        CompactingMachineId.of("fgt56"),
                        new BallSize("Medium"),
                        new Material("Plastic")

                )
        ));
        useCase.addRepository(repository);
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong changing the Material"))
                .getDomainEvents();

        var event = (MaterialChanged)events.get(0);
        Assertions.assertEquals(command.getMaterial().value(), event.getMaterial().value());
        Mockito.verify(repository).getEventsBy(ROOT_ID);
    }
}