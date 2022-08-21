package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.felipeGil.desafioddd.domain.ball_creation.BallCreation;
import com.felipeGil.desafioddd.domain.ball_creation.commands.AddCompactingMachine;


public class AddCompactingMachineUseCase extends UseCase<RequestCommand<AddCompactingMachine>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AddCompactingMachine> addCompactingMachineRequestCommand) {
        var command = addCompactingMachineRequestCommand.getCommand();
        var ballCreation = BallCreation.from(command.getBallCreationId(), retrieveEvents(command.getBallCreationId().value()));
        ballCreation.addCompactingMachine(command.getCompactingMachineId(), command.getBallSize(), command.getMaterial());
        emit().onResponse(new ResponseEvents(ballCreation.getUncommittedChanges()));
    }
}
