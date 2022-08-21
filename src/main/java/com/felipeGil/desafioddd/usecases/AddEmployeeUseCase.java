package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.felipeGil.desafioddd.domain.ball_creation.BallCreation;
import com.felipeGil.desafioddd.domain.ball_creation.commands.AddEmployee;

public class AddEmployeeUseCase extends UseCase<RequestCommand<AddEmployee>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddEmployee> addEmployeeRequestCommand) {
        var command = addEmployeeRequestCommand.getCommand();
        var ballCreation = BallCreation.from(command.getBallCreationId(), retrieveEvents(command.getBallCreationId().value()));
        ballCreation.addEmployee(command.getEmployeeId(), command.getName(), command.getMachineInCharge(), command.getSalary());
        emit().onResponse(new ResponseEvents(ballCreation.getUncommittedChanges()));
    }
}
