package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.felipeGil.desafioddd.domain.ball_creation.BallCreation;
import com.felipeGil.desafioddd.domain.ball_creation.commands.ChangeMaterial;
import com.felipeGil.desafioddd.domain.ball_design.BallDesing;

public class ChangeMaterialUseCase extends UseCase<RequestCommand<ChangeMaterial>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ChangeMaterial> changeMaterialRequestCommand) {
        var command = changeMaterialRequestCommand.getCommand();
        var ballCreation = BallCreation.from(command.getBallCreationId(),retrieveEvents(command.getBallCreationId().value()));
        ballCreation.changeMaterial(command.getCompactingMachineId(), command.getMaterial());
        emit().onResponse(new ResponseEvents(ballCreation.getUncommittedChanges()));
    }
}
