package com.felipeGil.desafioddd.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.felipeGil.desafioddd.domain.ball_design.BallDesing;
import com.felipeGil.desafioddd.domain.ball_design.commands.ChangeCoreType;

public class ChangeCoreTypeUseCase extends UseCase<RequestCommand<ChangeCoreType>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ChangeCoreType> changeCoreTypeRequestCommand) {
        var command = changeCoreTypeRequestCommand.getCommand();
        var ballDesing = BallDesing.from(command.getBallDesingId(),retrieveEvents(command.getBallDesingId().value()));
        ballDesing.changeCoreType(command.getCoreDesingId(), command.getCoreType());
        emit().onResponse(new ResponseEvents(ballDesing.getUncommittedChanges()));
    }
}
