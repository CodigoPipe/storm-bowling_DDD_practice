package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.felipeGil.desafioddd.domain.ball_creation.BallCreation;
import com.felipeGil.desafioddd.domain.ball_creation.commands.AddDrillingMachine;

public class AddDrillingMachineUseCase extends UseCase<RequestCommand<AddDrillingMachine>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AddDrillingMachine> addDrillingMachineRequestCommand) {
        var command = addDrillingMachineRequestCommand.getCommand();
        var ballCreation = BallCreation.from(command.getBallCreationId(), retrieveEvents(command.getBallCreationId().value()));
        ballCreation.addDrillingMachine(command.getDrillingMachineId(), command.getHoleSize(), command.getNumerOfHoles());
        emit().onResponse(new ResponseEvents(ballCreation.getUncommittedChanges()));
    }
}
