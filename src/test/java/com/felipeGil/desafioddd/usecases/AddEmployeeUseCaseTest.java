package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.felipeGil.desafioddd.domain.ball_creation.commands.AddEmployee;
import com.felipeGil.desafioddd.domain.ball_creation.events.BallCreationCreated;
import com.felipeGil.desafioddd.domain.ball_creation.events.EmployeeAdded;
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
class AddEmployeeUseCaseTest {

    private final String ROOT_ID = "wes454col";

    @Mock
    private DomainEventRepository repository;

    @Test
    public void addEmployeeUseCaseTest() {
        var command = new AddEmployee(BallCreationId.of(ROOT_ID), EmployeeId.of("123412"), new Name("vitor hugo"), new MachineInCharge("Drilling machine 2"), new Salary(1500));
        var useCase = new AddEmployeeUseCase();

        Mockito.when(repository.getEventsBy(ROOT_ID)).thenReturn(List.of(
                new BallCreationCreated(
                        new StartDate("03/12/2021"),
                        new EndDate("02/05/2022"),
                        new BallDesingId()
                )
        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(()->new IllegalArgumentException("Something went wrong Adding the Employee"))
                .getDomainEvents();

        var event = (EmployeeAdded)events.get(0);
        Assertions.assertEquals(command.getName().value(), event.getName().value());
        Assertions. assertEquals(command.getMachineInCharge().value(), event.getMachineInCharge().value());
        Assertions. assertEquals(command.getSalary().value(), event.getSalary().value());
        Mockito.verify(repository).getEventsBy(ROOT_ID);
    }
}